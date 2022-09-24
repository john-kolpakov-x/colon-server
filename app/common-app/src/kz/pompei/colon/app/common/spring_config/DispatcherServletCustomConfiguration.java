package kz.pompei.colon.app.common.spring_config;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.DispatcherServlet;


@Configuration
public class DispatcherServletCustomConfiguration {

  @Bean
  public DispatcherServlet dispatcherServletCustom() {
    return new DispatcherServlet();
  }

  @Bean
  @Primary
  public DispatcherServletPath dispatcherServletCustomPath() {
    return new DispatcherServletRegistrationBean(dispatcherServletCustom(), "/web/");
  }

}
