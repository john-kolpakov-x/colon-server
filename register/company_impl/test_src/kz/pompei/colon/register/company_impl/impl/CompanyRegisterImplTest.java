package kz.pompei.colon.register.company_impl.impl;

import kz.pompei.colon.register.common_for_tests.ParentTestNg;
import kz.pompei.colon.register.company_impl.test_dao.CompanyTestDao;
import kz.pompei.colon.register.company_meta.CompanyRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

@ContextConfiguration(classes = CompanyRegisterImpl.class)
@MapperScan(basePackageClasses = CompanyTestDao.class)
public class CompanyRegisterImplTest extends ParentTestNg {
  @Autowired
  private CompanyRegister companyRegister;

  @Test
  public void testName() {
    System.out.println("xWT4UpgMHf :: " + companyRegister);
  }
}
