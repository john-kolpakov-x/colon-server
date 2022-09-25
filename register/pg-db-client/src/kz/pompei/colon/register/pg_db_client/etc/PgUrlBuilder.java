package kz.pompei.colon.register.pg_db_client.etc;

import java.util.Arrays;
import lombok.RequiredArgsConstructor;

import static java.util.stream.Collectors.joining;

@RequiredArgsConstructor
public class PgUrlBuilder {

  private final String host;
  private final int    port;
  private final String dbName;

  private String schema = "public";

  @SuppressWarnings("unused")
  public PgUrlBuilder schema(String schema) {
    this.schema = schema;
    return this;
  }

  public static PgUrlBuilder on(String host, int port, String dbName) {
    return new PgUrlBuilder(host, port, dbName);
  }

  public String build() {

    String hostPort = Arrays.stream(host.split(","))
                            .map(String::trim)
                            .map(s -> s + ":" + port)
                            .collect(joining(","));

    return "jdbc:postgresql://" + hostPort + "/" + dbName + "?currentSchema=" + schema;
  }

}
