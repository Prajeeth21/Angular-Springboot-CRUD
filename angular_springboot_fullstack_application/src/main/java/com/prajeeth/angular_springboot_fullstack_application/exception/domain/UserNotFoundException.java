package com.prajeeth.angular_springboot_fullstack_application.exception.domain;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message){
        super(message);
    }  
}
