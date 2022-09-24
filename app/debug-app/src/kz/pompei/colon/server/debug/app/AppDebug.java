package kz.pompei.colon.server.debug.app;

import kz.pompei.colon.app.common.app.AppAbstract;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DebugImportSet.class)
public class AppDebug extends AppAbstract {
  public static void main(String[] args) {
    SpringApplication.run(AppDebug.class, args);
  }
}
