package com.example.Spring.Security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import java.net.http.HttpRequest;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defualtSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests((request) ->
                request.requestMatchers("/account", "/balance", "/loan", "/card").authenticated()
                        .requestMatchers("/contact", "/notice").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
    }
}
