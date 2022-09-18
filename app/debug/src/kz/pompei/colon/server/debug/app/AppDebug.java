package kz.pompei.colon.server.debug.app;

import kz.pompei.colon.app.common.app.AppAbstract;
import kz.pompei.colon.app.common.import_configs.ImportConfigControllers;
import kz.pompei.colon.app.common.spring_config.ImportConfigCommonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ImportConfigControllers.class, ImportConfigCommonConfig.class})
public class AppDebug extends AppAbstract {
  public static void main(String[] args) {
    SpringApplication.run(AppDebug.class, args);
  }
}
