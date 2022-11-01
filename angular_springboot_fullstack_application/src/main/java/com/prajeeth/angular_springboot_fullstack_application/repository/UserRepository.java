package com.prajeeth.angular_springboot_fullstack_application.repository;

import org.springframework.stereotype.Repository;

import com.prajeeth.angular_springboot_fullstack_application.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    User findUserByUsername(String username);
    User findUserByEmail(String email);

}
