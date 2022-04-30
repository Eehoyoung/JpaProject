package com.example.jpaproject.repository.inerface;

import com.example.jpaproject.domain.listener.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
    List<UserHistory> findByUserId(Long userId);
}
