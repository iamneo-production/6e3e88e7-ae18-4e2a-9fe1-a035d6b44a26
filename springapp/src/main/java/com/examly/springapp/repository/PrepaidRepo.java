package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.model.Prepaid;

import java.util.Optional;

public interface PrepaidRepo extends JpaRepository<Prepaid,Long> {
    void deleteById(Long id);

    Optional<Prepaid> findPrepaidPlanById(Long id);
}
