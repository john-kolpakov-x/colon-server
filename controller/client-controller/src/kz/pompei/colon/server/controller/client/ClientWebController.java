package kz.pompei.colon.server.controller.client;

import kz.pompei.colon.register.client_meta.ClientRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientWebController {

  @Autowired
  private ClientRegister clientRegister;


  @GetMapping("/helloClient")
  public String helloClient(@RequestParam("clientName") String clientName) {
    return clientRegister.hello(clientName);
  }

  @GetMapping("/helloClient2")
  public String helloClient2(@RequestParam("clientName") String clientName) {
    return "Hello2, " + clientName;
  }

}
