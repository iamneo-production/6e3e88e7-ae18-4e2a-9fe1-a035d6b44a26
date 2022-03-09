package com.adminplan.demo.service;

import com.adminplan.demo.exception.UserNotFoundException;
import com.adminplan.demo.model.Admin;
import com.adminplan.demo.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AdminService {
    private final AdminRepo adminRepo;

    @Autowired
    public AdminService(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }

    public Admin addAdminPlan(Admin admin) {
        return adminRepo.save(admin);
    }
    public List<Admin> findAllAdminPlan() {return adminRepo.findAll(); }

    public Admin updateAdminPlan(Admin admin){ return adminRepo.save(admin); }

    public Admin findAdminPlanById(Long id){
        return adminRepo.findAdminPlanById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id "+id+" was not found"));
    }

    public void deleteById(Long id){ adminRepo.deleteById(id);}
}
