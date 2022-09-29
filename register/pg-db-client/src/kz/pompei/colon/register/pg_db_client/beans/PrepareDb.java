package kz.pompei.colon.register.pg_db_client.beans;

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
