package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.model.AddOn;

import java.util.Optional;

public interface AddOnRepo extends JpaRepository<AddOn,Long> {
    void deleteById(Long id);

    Optional<AddOn> findAddOnPlanById(Long id);
}
