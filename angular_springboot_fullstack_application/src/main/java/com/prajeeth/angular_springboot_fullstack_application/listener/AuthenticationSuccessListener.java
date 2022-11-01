package com.prajeeth.angular_springboot_fullstack_application.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

import com.prajeeth.angular_springboot_fullstack_application.model.UserPrinciple;
import com.prajeeth.angular_springboot_fullstack_application.service.LoginAttemptService;

@Component
public class AuthenticationSuccessListener {

    private LoginAttemptService loginAttemptService;

    @Autowired
    public AuthenticationSuccessListener(LoginAttemptService loginAttemptService) {
        this.loginAttemptService = loginAttemptService;
    }

    @EventListener
    public void onAuthenticationSuccess(AuthenticationSuccessEvent event) {
        Object principal = event.getAuthentication().getPrincipal();
        if(principal instanceof UserPrinciple) {
            UserPrinciple user = (UserPrinciple) event.getAuthentication().getPrincipal();
            loginAttemptService.evictUserFromLoginAttemptCache(user.getUsername());
        }
    }
    
}
