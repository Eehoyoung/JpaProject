package com.example.jpaproject.repository.inerface;


import com.example.jpaproject.domain.listener.BookAndAuthor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookAndAuthorRepository extends JpaRepository<BookAndAuthor, Long> {
}

