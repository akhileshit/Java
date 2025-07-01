package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig { // copied as-it-is on kod app!
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity
			.authorizeHttpRequests(auth -> {
				auth.requestMatchers("/pub").permitAll(); // Allow access to /pub without Authentication
				auth.requestMatchers("/admin").authenticated(); // Require authentication for /admin
			})
			.httpBasic(httpBasic -> httpBasic.realmName("Admin Realm")); // use HTTP Basic Authentication
		
		return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		User.UserBuilder userBuilder = User.builder();
		userBuilder.username("admin"); // Username for /admin
		userBuilder.password(passwordEncoder().encode("kodnest")); // password for /admin
		userBuilder.roles("ADMIN");
		UserDetails admin = userBuilder.build();
		
		return new InMemoryUserDetailsManager(admin);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
