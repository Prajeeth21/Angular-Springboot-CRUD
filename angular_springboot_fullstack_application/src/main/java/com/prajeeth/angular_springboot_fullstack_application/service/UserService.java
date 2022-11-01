package com.prajeeth.angular_springboot_fullstack_application.service;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import com.prajeeth.angular_springboot_fullstack_application.exception.domain.EmailExistException;
import com.prajeeth.angular_springboot_fullstack_application.exception.domain.EmailNotFoundException;
import com.prajeeth.angular_springboot_fullstack_application.exception.domain.UserNotFoundException;
import com.prajeeth.angular_springboot_fullstack_application.exception.domain.UsernameExistException;
import com.prajeeth.angular_springboot_fullstack_application.model.User;

public interface UserService {
    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, MessagingException;
    List<User> getUsers();
    User findUserByUsername(String username);
    User findUserByEmail(String email);
    User addNewUser(String firstName, String lastName, String username, String email, String role, boolean isNonLocked, boolean isActive) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException;
    User updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername, String newEmail, String role, boolean isNonLocked, boolean isActive) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException;
    void deleteUser(String username) throws IOException;
    void resetPassword(String email) throws MessagingException, EmailNotFoundException;
}
