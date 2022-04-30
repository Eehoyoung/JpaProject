package com.example.jpaproject.repository.inerface;


import com.example.jpaproject.domain.listener.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<Comment, Long> {
}
