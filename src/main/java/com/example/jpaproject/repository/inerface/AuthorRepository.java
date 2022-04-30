package com.example.jpaproject.repository.inerface;


import com.example.jpaproject.domain.listener.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository <Author, Long> {
}
