package io.github.hmdusk.demo.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.Resource;

/**
 * 权限验证配置文件
 *
 * @author liming
 * @date Created in 2018/1/16 9:37
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("hello").permitAll()
				.anyRequest().authenticated()
				.and()
				.formLogin()
//				.loginPage("login")
				.permitAll()
				.and()
				.logout()
				.permitAll();
	}

	@Resource
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
				.withUser("user").password("password").roles("USER");
	}
}
