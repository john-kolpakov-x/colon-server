package kz.pompei.colon.register.db_client_pg.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrepareDb {

  @Autowired
  private LiquibaseManager liquibaseManager;

  public void prepareDb() {
    liquibaseManager.applyChangeSets();
  }

}
