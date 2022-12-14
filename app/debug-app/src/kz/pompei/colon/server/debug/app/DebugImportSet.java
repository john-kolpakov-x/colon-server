package kz.pompei.colon.server.debug.app;

import kz.pompei.colon.app.common.import_configs.ImportConfigControllers;
import kz.pompei.colon.app.common.spring_config.ImportConfigCommonConfig;
import kz.pompei.colon.register.client_impl.impl.ClientRegisterImpl;
import kz.pompei.colon.register.db_client_pg.beans.ImporterDbClient;
import kz.pompei.colon.server.config.debug.ImporterConfigDebug;
import org.springframework.context.annotation.Import;

@Import({
  ImportConfigControllers.class,
  ImportConfigCommonConfig.class,
  ImporterDbClient.class,
  ImporterConfigDebug.class,

  ClientRegisterImpl.class
})
public class DebugImportSet {}
