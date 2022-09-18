#!/usr/bin/env sh

set -e

cd "$(dirname "$0")" || exit 131

NETWORK=debug-colon

for cid in $(podman ps -f "network=$NETWORK" -q) ; do
  echo "removing container $cid"
  podman rm -f "$cid"
done

DEBUG_VOLUMES_DIR="$HOME/volumes/colon-server-debug"
PG_DATA_DIR="$DEBUG_VOLUMES_DIR/pg-data"

podman run --rm -v "$DEBUG_VOLUMES_DIR/:/data" -i \
           busybox:1.28 \
           find /data -mindepth 1 -maxdepth 1 -exec \
           rm -rf {} \;

podman network create "$NETWORK" | true

mkdir -p "$PG_DATA_DIR"

IMAGE=docker.io/library/postgres:14.5
OP=
OP="$OP    --name debug-colon-pg"
OP="$OP --network $NETWORK"
OP="$OP --restart always"
OP="$OP        -p 21001:5432"
OP="$OP        -e POSTGRES_PASSWORD=Mj57nItZZ68yUB1aoO7w"
OP="$OP        -v $PG_DATA_DIR:/var/lib/postgresql/data"
OP="$OP        -v $PWD/pg-init:/docker-entrypoint-initdb.d"
OP="$OP        -d"
podman run $OP "$IMAGE" docker-entrypoint.sh -c max-connections=800
