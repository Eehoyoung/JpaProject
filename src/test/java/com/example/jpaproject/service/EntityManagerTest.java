package com.example.jpaproject.service;

import com.example.jpaproject.domain.listener.User;
import com.example.jpaproject.repository.inerface.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;


@SpringBootTest
@Transactional
public class EntityManagerTest {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private UserRepository userRepository;

    @Test
    void entityManagerTest() {
        System.out.println(entityManager.createQuery("select u from User u").getResultList());
    }

    @Test
    void cacheFindTest() {
        userRepository.deleteById(1L);
    }

    @Test
    void cacheFindTest2() {
        User user = userRepository.findById(1L).get();
        user.setName("marrrrrrrtin");
        userRepository.save(user);

        System.out.println("---------------------");

        user.setEmail("marrrrrrtin@fastcampus.com");
        userRepository.save(user);

        System.out.println(userRepository.findAll());       // select * from user
    }
}
