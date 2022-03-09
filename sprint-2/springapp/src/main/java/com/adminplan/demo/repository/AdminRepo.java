package com.adminplan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adminplan.demo.model.Admin;

import java.util.Optional;

public interface AdminRepo extends JpaRepository<Admin,Long> {
    void deleteById(Long id);

    Optional<Admin> findAdminPlanById(Long id);
}
