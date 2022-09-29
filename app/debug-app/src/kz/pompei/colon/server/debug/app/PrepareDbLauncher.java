package kz.pompei.colon.server.debug.app;

import kz.pompei.colon.register.db_client_pg.beans.PrepareDb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrepareDbLauncher {
  public static void main(String[] args) {

    final ApplicationContext context = new AnnotationConfigApplicationContext(DebugImportSet.class);

    context.getBean(PrepareDb.class).prepareDb();
  }

}
