package kz.pompei.colon.register.client_impl.impl;

import kz.greetgo.util.RND;
import kz.pompei.colon.model.client.ClientRecord;
import kz.pompei.colon.register.client_impl.dao.ClientDao;
import kz.pompei.colon.register.client_impl.test_dao.ClientTestDao;
import kz.pompei.colon.register.client_meta.ClientRegister;
import kz.pompei.colon.register.common_for_tests.ParentTestNg;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = ClientRegisterImpl.class)
@MapperScan(basePackageClasses = ClientTestDao.class)
@MapperScan(basePackageClasses = ClientDao.class)
public class ClientRegisterImplTest extends ParentTestNg {

  //region Autowired fields
  @Autowired
  private ClientRegister clientRegister;

  @Autowired
  private ClientTestDao clientTestDao;
  //endregion


  @Test
  public void loadClientRecord() {

    ClientRecord c = new ClientRecord();
    c.id         = RND.str(10);
    c.surname    = RND.str(107);
    c.name       = RND.str(10);
    c.patronymic = RND.str(13);

    clientTestDao.insertClientRecord(c);

    //
    //
    final ClientRecord actualRecord = clientRegister.loadClientRecord(c.id);
    //
    //

    assertThat(actualRecord).isNotNull();
    assertThat(actualRecord.id).isEqualTo(c.id);
    assertThat(actualRecord.surname).isEqualTo(c.surname);
    assertThat(actualRecord.name).isEqualTo(c.name);
    assertThat(actualRecord.patronymic).isEqualTo(c.patronymic);

  }

}
