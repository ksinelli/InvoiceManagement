
package com.hk.ks.configurations;
  
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
  
@Configuration
@EnableWebSecurity
public class Configurations extends WebSecurityConfigurerAdapter {
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	
	@Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
	}
	
//	@Bean
//	@Primary
//    public DataSource setDataSource() {
//        DataSource dataSource = DataSourceBuilder.create()
//        		.driverClassName("org.postgresql.Driver")
//        		.url("jdbc:postgresql://ziggy.db.elephantsql.com/cyrabjnm")
//        		.username("cyrabjnm")
//        		.password("IF-eABBLX4PSF2Crk41nNTYflaDIl_Cx")
//        		.build();
//        return dataSource;
//    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        	.mvcMatchers("/login**").permitAll()
        	.mvcMatchers("/register**").permitAll()
        	.mvcMatchers("/error**").permitAll()
          	.mvcMatchers("/home").authenticated()
        	.and()
        	.formLogin()
        		.loginPage("/login")
        		.loginProcessingUrl("/login/process")
        		.successForwardUrl("/home")
        		.failureForwardUrl("/error");
	}
}
	  
 
