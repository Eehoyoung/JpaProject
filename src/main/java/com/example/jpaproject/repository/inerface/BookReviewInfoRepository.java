package com.example.jpaproject.repository.inerface;

import com.example.jpaproject.domain.listener.BookReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewInfoRepository extends JpaRepository<BookReviewInfo, Long> {
}

