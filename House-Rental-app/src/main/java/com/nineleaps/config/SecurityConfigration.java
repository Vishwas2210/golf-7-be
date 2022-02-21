package com.nineleaps.config;

import com.nineleaps.service.auth.CustomAuth2User;
import com.nineleaps.service.auth.CustomAuth2UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
class SecurityConfigration extends WebSecurityConfigurerAdapter {

    private CustomAuth2UserService customAuth2User;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().antMatchers("/user/registration", "/user/google").permitAll()
                .anyRequest().authenticated().and().oauth2Login();
        /*.loginPage("/login").userInfoEndpoint().
        userService(customAuth2User);*/
    }

}

