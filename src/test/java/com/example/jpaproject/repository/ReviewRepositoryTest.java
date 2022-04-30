package com.example.jpaproject.repository;

import com.example.jpaproject.domain.listener.Review;
import com.example.jpaproject.repository.inerface.ReviewRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
public class ReviewRepositoryTest {
    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    @Transactional
    void reviewTest() {
        List<Review> reviews = reviewRepository.findAll();

        reviews.forEach(System.out::println);
    }
}
