package com.example.jpaproject.service;

import com.example.jpaproject.repository.inerface.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @Test
    void test() {
        userService.put();

//        System.out.println(">>> " + userRepository.findByEmail("newUser@fastcampus.com"));
        userRepository.findAll().forEach(System.out::println);
    }

}
