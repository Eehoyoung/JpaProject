package com.example.jpaproject.repository.inerface;

import com.example.jpaproject.domain.listener.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
