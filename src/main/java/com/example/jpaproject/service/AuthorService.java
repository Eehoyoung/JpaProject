package com.example.jpaproject.service;

import com.example.jpaproject.domain.listener.Author;
import com.example.jpaproject.repository.inerface.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Transactional(propagation =  Propagation.NESTED)
    public void putAuthor() {
        Author author = new Author();
        author.setName("martin");

        authorRepository.save(author);

    }
}
