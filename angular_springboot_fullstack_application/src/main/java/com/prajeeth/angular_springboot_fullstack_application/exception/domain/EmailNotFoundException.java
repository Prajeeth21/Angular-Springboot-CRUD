package com.prajeeth.angular_springboot_fullstack_application.exception.domain;

public class EmailNotFoundException extends Exception{
    public EmailNotFoundException(String message){
        super(message);
    }
}
