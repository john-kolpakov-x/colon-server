package kz.pompei.colon.app.common.app;

import javax.annotation.PostConstruct;
import kz.pompei.colon.register.pg_db_client.beans.LiquibaseManager;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AppAbstract {

  @Autowired
  private LiquibaseManager liquibaseManager;


  @PostConstruct
  public void initialize() {

    liquibaseManager.applyChangeSets();

  }

}
