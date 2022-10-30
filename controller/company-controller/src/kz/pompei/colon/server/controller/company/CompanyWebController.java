package kz.pompei.colon.server.controller.company;

import java.util.List;
import kz.pompei.colon.model.company.mmi.MmiRec;
import kz.pompei.colon.register.company_meta.CompanyRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyWebController {

  @Autowired
  private CompanyRegister companyRegister;

  @PostMapping("/loadMainMenu")
  public List<MmiRec> loadMainMenu() {
    return companyRegister.loadMainMenu();
  }

}
