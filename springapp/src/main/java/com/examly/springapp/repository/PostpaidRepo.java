package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.model.Postpaid;

import java.util.Optional;

public interface PostpaidRepo extends JpaRepository<Postpaid,Long> {
    void deleteById(Long id);

    Optional<Postpaid> findPostpaidPlanById(Long id);
}
