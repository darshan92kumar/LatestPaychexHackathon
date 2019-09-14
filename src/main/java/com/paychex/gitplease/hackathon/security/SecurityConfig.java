package com.paychex.gitplease.hackathon.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// add our users for in memory authentication
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username("john").password("test123").roles("EMPLOYEE"))  // Spring security uses ROLE_ as prefix. on UI we would see ROLE_EMPLYOEE
			.withUser(users.username("mary").password("test123").roles("MANAGER","EMPLOYEE")) // we can add more roles using comma delimited
			.withUser(users.username("susan").password("test123").roles("ADMIN","EMPLOYEE"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
				//.anyRequest().authenticated() // this means ANY request, not restricted.
			.antMatchers("/admin").hasRole("ADMIN")
			.and()
			.formLogin()
				.loginPage("/adminLoginPage")
				.loginProcessingUrl("/adminAuth")
				.permitAll()
			.and()
			.logout()
			.permitAll()
			.and()
			.exceptionHandling().accessDeniedPage("/access-denied");
		
	}

}
