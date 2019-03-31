package sda.soft.academy.lunchyproject.lunchy.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/user/register", "/user/activate", "/user/login", "/message").permitAll()
                .antMatchers("/order/add").authenticated()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/user/login")
                .loginProcessingUrl("/user/loginAction")
                .usernameParameter("login")
                .passwordParameter("password")
                .defaultSuccessUrl("/message?msg=successful login")
                .failureUrl("/message?msg=unsuccessful login")
                .permitAll();
    }
}
