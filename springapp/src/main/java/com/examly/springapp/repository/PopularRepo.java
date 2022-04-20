package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.model.Popular;

import java.util.Optional;

public interface PopularRepo extends JpaRepository<Popular,Long> {
    void deleteById(Long id);

    Optional<Popular> findPopularPlanById(Long id);
}