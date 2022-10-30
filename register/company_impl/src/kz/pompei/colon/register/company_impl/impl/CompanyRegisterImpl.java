package kz.pompei.colon.register.company_impl.impl;

import java.util.List;
import kz.pompei.colon.model.company.mmi.MmiRec;
import kz.pompei.colon.register.company_meta.CompanyRegister;
import org.springframework.stereotype.Component;

@Component
public class CompanyRegisterImpl implements CompanyRegister {
  @Override
  public List<MmiRec> loadMainMenu() {
    throw new RuntimeException("30.10.2022 17:57 Not impl yet CompanyRegisterImpl.loadMainMenu()");
  }
}
