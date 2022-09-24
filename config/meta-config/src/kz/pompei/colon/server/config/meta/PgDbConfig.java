package kz.pompei.colon.server.config.meta;

public interface PgDbConfig {

  String host();

  int port();

  String dbName();

  String username();

  String password();

}
