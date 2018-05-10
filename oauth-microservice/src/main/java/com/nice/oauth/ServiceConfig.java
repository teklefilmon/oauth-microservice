package com.nice.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

/**
 *
 */
@Configuration
public class ServiceConfig extends GlobalAuthenticationConfigurerAdapter
{

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception
	{
		auth
			.inMemoryAuthentication()
			.withUser("user1")
			.password("pass1")
			.roles("ADD_BOOKING", "VIEW_BOOKING")
		.and()
			.withUser("user2")
			.password("pass2")
			.roles("VIEW_BOOKING");
	}

}
