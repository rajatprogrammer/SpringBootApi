package com.rajat.app.ws.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.rajat.app.ws.service.userService;

@EnableWebSecurity
public class webSecurity extends WebSecurityConfigurerAdapter {
	private final userService userDetailService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	public webSecurity(userService userDetailService, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userDetailService = userDetailService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;

	}

	@Override
	protected void configure(HttpSecurity http ) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.POST,"/user/create/user")
		.permitAll()
		.anyRequest()
		.authenticated();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailService).passwordEncoder(bCryptPasswordEncoder);
	}
}
