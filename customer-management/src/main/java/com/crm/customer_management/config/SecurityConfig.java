package com.crm.customer_management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((httpRequests) ->
                        httpRequests.requestMatchers("/login","/resources/**").permitAll()
                        .anyRequest().authenticated())
//                .oauth2Login(withDefaults())
                .formLogin((form) -> form.loginPage("/login").permitAll()
                        .successHandler((request, response, authentication) -> {
                            response.sendRedirect("/home"); // Redirect to /home
                        }))
                .logout(withDefaults());
        return http.build();
    }

}
