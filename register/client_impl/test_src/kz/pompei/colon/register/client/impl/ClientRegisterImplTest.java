package kz.pompei.colon.register.client.impl;

import kz.pompei.colon.register.client.impl.test_dao.ClientTestDao;
import kz.pompei.colon.register.client.impl.test_dao.ImporterTestDao_Client;
import kz.pompei.colon.register.client_meta.ClientRegister;
import kz.pompei.colon.register.common_for_tests.ParentTestNg;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = ClientRegisterImpl.class)
@MapperScan(basePackageClasses = ImporterTestDao_Client.class)
public class ClientRegisterImplTest extends ParentTestNg {

  @Autowired
  private ClientRegister clientRegister;

  @Autowired
  private ClientTestDao clientTestDao;


  @Test
  public void testHello() {

    clientTestDao.insertClient("asd", "asd", "asd", "asd");

    final String answer = clientRegister.hello("asd");

    assertThat(answer).isEqualTo("Hello, asd");

  }

}
