package kz.pompei.colon.register.db_client_pg.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import kz.pompei.colon.register.db_client_pg.etc.PgUrlBuilder;
import kz.pompei.colon.server.config.meta.PgDbConfig;
import liquibase.Liquibase;
import liquibase.database.core.PostgresDatabase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.ClassLoaderResourceAccessor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LiquibaseManager {

  @Autowired
  private PgDbConfig dbConfig;

  public Connection openConnection() throws SQLException {
    var urlBuilder = PgUrlBuilder.on(dbConfig.host(), dbConfig.port(), dbConfig.dbName());
    return DriverManager.getConnection(urlBuilder.build(), dbConfig.username(), dbConfig.password());
  }

  @SneakyThrows
  public void applyChangeSets() {
    Class.forName("org.postgresql.Driver");
    try (var connection = openConnection()) {
      var database = new PostgresDatabase();
      database.setConnection(new JdbcConnection(connection));
      new Liquibase("liquibase/change-log.xml", new ClassLoaderResourceAccessor(), database).update("");
    }
  }

}
