package com.workflow_runner.sales_workflow.configuration;

import java.sql.SQLException;
import javax.sql.DataSource;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.context.annotation.Bean;

//@Configuration
//@ConfigurationProperties("oracle")
public class OracleConfiguration {
  
   private String username;

   private String password;

   private String url;

   public void setUsername(String username) {
       this.username = username;
   }

   public void setPassword(String password) {
       this.password = password;
   }

   public void setUrl(String url) {
       this.url = url;
   }

   @Bean
   DataSource dataSource() throws SQLException {

       OracleDataSource dataSource = new OracleDataSource();
       dataSource.setUser(username);
       dataSource.setPassword(password);
       dataSource.setURL(url);
       dataSource.setImplicitCachingEnabled(true);
       dataSource.setFastConnectionFailoverEnabled(true);
       return dataSource;
   }
}
