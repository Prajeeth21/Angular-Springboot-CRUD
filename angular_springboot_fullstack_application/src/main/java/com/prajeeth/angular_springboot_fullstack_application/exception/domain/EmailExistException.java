package com.prajeeth.angular_springboot_fullstack_application.exception.domain;

public class EmailExistException extends Exception {
    public EmailExistException(String message){
        super(message);
    }
}
