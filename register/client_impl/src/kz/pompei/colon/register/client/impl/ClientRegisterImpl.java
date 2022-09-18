package kz.pompei.colon.register.client.impl;

import kz.pompei.colon.register.client_meta.ClientRegister;
import org.springframework.stereotype.Component;

@Component
public class ClientRegisterImpl implements ClientRegister {
  @Override
  public String hello(String name) {
    return "Hello, " + name;
  }
}
