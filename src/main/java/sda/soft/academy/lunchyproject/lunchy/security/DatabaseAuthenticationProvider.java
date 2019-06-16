package sda.soft.academy.lunchyproject.lunchy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.services.UserService;


import java.util.ArrayList;

@Component
public class DatabaseAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private UserService userService;


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();
        String password = authentication.getCredentials().toString();
        boolean logged = userService.login(login, password);
        if(logged) {
            return new UsernamePasswordAuthenticationToken(login, password, new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User with " + login + " was not found");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}