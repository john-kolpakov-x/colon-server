package kz.pompei.colon.server.controller.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientWebController {

  @GetMapping("/helloClient")
  public String helloClient(@RequestParam("clientName") String clientName) {
    return "Hello, " + clientName;
  }

  @GetMapping("/helloClient2")
  public String helloClient2(@RequestParam("clientName") String clientName) {
    return "Hello2, " + clientName;
  }

}
