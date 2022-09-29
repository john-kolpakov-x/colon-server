package kz.pompei.colon.register.common_for_tests;

import kz.pompei.colon.register.common.ImporterRegisterCommon;
import kz.pompei.colon.register.pg_db_client.beans.ImporterDbClient;
import kz.pompei.colon.server.config.debug.ImporterConfigDebug;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(classes = {
  ImporterRegisterCommon.class,
  ImporterDbClient.class,
  ImporterConfigDebug.class,
})
public abstract class ParentTestNg extends AbstractTestNGSpringContextTests {}
