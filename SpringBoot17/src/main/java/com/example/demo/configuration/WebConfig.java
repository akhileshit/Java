package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.service.MyUserDetailService;

@Configuration
public class WebConfig {
	
	@Autowired
	private MyUserDetailService userDetailsService; // or can use UserDetailsService (which finds the implementation we wrote (MyUserDetailService))
	
	@Bean
	public SecurityFilterChain secFilter(HttpSecurity http) throws Exception { // My custom securityfilterchain!
		return http
				.csrf(customizer -> customizer.disable())
				.authorizeHttpRequests(request -> request.anyRequest().authenticated())
				.formLogin(Customizer.withDefaults())
				.httpBasic(Customizer.withDefaults())
				.build();

	}
	
	@Bean
	public AuthenticationProvider authProvider() { // My custom authentication provider!
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder()); //u should.
		return provider;
	}
	
//	@Bean
//	public UserDetailsService userDetailsService() {  // This is for no databases (use for just testing)
//		UserDetails user1 = User
//								.withDefaultPasswordEncoder()
//								.username("Aakaash")
//								.password("ak@123")
//								.build();
//		UserDetails user2 = User
//								.withDefaultPasswordEncoder()
//								.username("Anuradha")
//								.password("anu@123")
//								.build();	
//		
//		
//		return new InMemoryUserDetailsManager(user1, user2);
//	}
}
