package kz.pompei.colon.server.config.debug;

import kz.pompei.colon.server.config.meta.PgDbConfig;
import org.springframework.stereotype.Component;

@Component
public class PgDbConfig_ForDebug implements PgDbConfig {
  @Override
  public String host() {
    return "localhost";
  }

  @Override
  public int port() {
    return 21001;
  }

  @Override
  public String dbName() {
    return "client_db";
  }

  @Override
  public String username() {
    return "client";
  }

  @Override
  public String password() {
    return "q7lwRz1eMWt1lEL3nigK";
  }
}
