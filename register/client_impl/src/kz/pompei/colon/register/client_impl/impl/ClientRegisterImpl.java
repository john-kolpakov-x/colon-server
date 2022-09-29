package kz.pompei.colon.register.client_impl.impl;

import kz.pompei.colon.model.client.ClientRecord;
import kz.pompei.colon.register.client_impl.dao.ClientDao;
import kz.pompei.colon.register.client_meta.ClientRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@MapperScan(basePackageClasses = ClientDao.class)
public class ClientRegisterImpl implements ClientRegister {

//  @Autowired
//  private ClientDao clientDao;


  @Override
  public String hello(String name) {
    return "Hello, " + name;
  }

  @Override
  public ClientRecord loadClientRecord(String clientId) {
    return null;
//    return clientDao.loadById(clientId);
  }
}
