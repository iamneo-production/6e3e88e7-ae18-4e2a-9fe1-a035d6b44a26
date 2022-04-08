package com.examly.springapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.model.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
    void deleteById(Long id);

    Optional<User> findUserPlanById(Long id);
}
