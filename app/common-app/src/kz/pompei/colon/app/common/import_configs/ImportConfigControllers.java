package kz.pompei.colon.app.common.import_configs;

import kz.pompei.colon.server.controller.client.ClientWebController;
import kz.pompei.colon.server.controller.company.CompanyWebController;
import kz.pompei.colon.server.controller.test.TestWebController;
import org.springframework.context.annotation.Import;

@Import({
  ClientWebController.class,
  TestWebController.class,
  CompanyWebController.class,
})
public class ImportConfigControllers {}
