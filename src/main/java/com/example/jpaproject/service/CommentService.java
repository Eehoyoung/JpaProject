package com.example.jpaproject.service;

import com.example.jpaproject.domain.listener.Comment;
import com.example.jpaproject.repository.inerface.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Transactional
    public void init() {
        for (int i = 0; i < 10; i++) {
            Comment comment = new Comment();
            comment.setComment("최고예요");

            commentRepository.save(comment);
        }
    }

    @Transactional(readOnly = true)
    public void updateSomething() {
        List<Comment> comments = commentRepository.findAll();

        for (Comment comment : comments) {
            comment.setComment("별로예요");

//            commentRepository.save(comment);
        }
    }

    @Transactional
    public void insertSomething() {
//        Comment comment = new Comment();
        Comment comment = commentRepository.findById(1L).get();
        comment.setComment("이건뭐죠?");

//        commentRepository.save(comment);
    }
}
