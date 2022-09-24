package kz.pompei.colon.server.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestWebController {

  @GetMapping("/helloClient")
  public String helloClient(@RequestParam("clientName") String clientName) {
    return "Hello, " + clientName;
  }

  @GetMapping("/helloClient2")
  public String helloClient2(@RequestParam("clientName") String clientName) {
    return "Hello2, " + clientName;
  }

}
