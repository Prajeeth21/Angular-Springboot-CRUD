package com.prajeeth.angular_springboot_fullstack_application.exception.domain;

public class UsernameExistException extends Exception {
    public UsernameExistException(String message){
        super(message);
    } 
}
