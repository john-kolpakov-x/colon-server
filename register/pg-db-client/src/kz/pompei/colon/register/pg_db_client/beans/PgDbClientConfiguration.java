package kz.pompei.colon.register.pg_db_client.beans;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import kz.pompei.colon.register.pg_db_client.dao.ImporterDao;
import kz.pompei.colon.register.pg_db_client.etc.PgUrlBuilder;
import kz.pompei.colon.server.config.meta.PgDbConfig;
import lombok.SneakyThrows;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(basePackageClasses = ImporterDao.class)
@org.springframework.context.annotation.Configuration
public class PgDbClientConfiguration implements InitializingBean {

  @Autowired
  private PgDbConfig config;

  private DataSource dataSource;

  @Override
  public void afterPropertiesSet() {
    var hc = new HikariConfig();
    hc.setDriverClassName("org.postgresql.Driver");
    hc.setJdbcUrl(PgUrlBuilder.on(config.host(), config.port(), config.dbName()).build());
    hc.setUsername("client");
    hc.setPassword("q7lwRz1eMWt1lEL3nigK");

    hc.setIdleTimeout(15_000);
    hc.setMaximumPoolSize(100);

    dataSource = new HikariDataSource(hc);
  }

  @Bean
  public DataSource getDataSource() {
    return dataSource;
  }


  @Bean
  public JdbcTemplate aux1JdbcTemplate() {
    return new JdbcTemplate(getDataSource(), true);
  }

  @Bean
  public DataSourceTransactionManager txManager() {
    return new DataSourceTransactionManager(getDataSource());
  }

  @Bean
  @SneakyThrows
  public SqlSessionFactory sqlSessionFactory() {
    var configuration = new Configuration();
    configuration.setJdbcTypeForNull(JdbcType.NULL);
    configuration.setLogImpl(Slf4jImpl.class);
    configuration.setMapUnderscoreToCamelCase(true);
    //configuration.getTypeHandlerRegistry().register(SomeEnum.class, new CustomEnumTypeHandler<>(SomeEnum.class));

    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(getDataSource());
    sqlSessionFactoryBean.setConfiguration(configuration);

    return sqlSessionFactoryBean.getObject();
  }
}
