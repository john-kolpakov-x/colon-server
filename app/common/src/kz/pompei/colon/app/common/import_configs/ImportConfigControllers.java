package kz.pompei.colon.app.common.import_configs;

import kz.pompei.colon.server.controller.client.ImportConfigWebControllerClient;
import org.springframework.context.annotation.Import;

@Import(ImportConfigWebControllerClient.class)
public class ImportConfigControllers {}
