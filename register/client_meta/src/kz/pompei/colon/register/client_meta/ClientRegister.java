package kz.pompei.colon.register.client_meta;

import kz.pompei.colon.model.client.ClientRecord;

public interface ClientRegister {

  String hello(String name);

  ClientRecord loadClientRecord(String clientId);

}
