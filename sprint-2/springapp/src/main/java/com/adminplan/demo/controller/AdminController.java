package com.adminplan.demo.controller;

import com.adminplan.demo.model.Admin;
import com.adminplan.demo.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin-plan")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Admin>> getAllAdminPlan(){
        List<Admin> adminPlans= adminService.findAllAdminPlan();
        return new ResponseEntity<>(adminPlans, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/find/{id}")
    public ResponseEntity<Admin> getAdminPlanById(@PathVariable("id") Long id){
        Admin adminPlan= adminService.findAdminPlanById(id);
        return new ResponseEntity<>(adminPlan, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Admin> addAdminPlan(@RequestBody Admin admin){
        Admin newAdminPlan = adminService.addAdminPlan(admin);
        return new ResponseEntity<>(newAdminPlan, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Admin> updateAdminPlan(@PathVariable("id") Long id,@RequestBody Admin admin){
        Admin updatePlan = adminService.updateAdminPlan(admin);
        return new ResponseEntity<>(updatePlan, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAdminPlan(@PathVariable("id") Long id){
        adminService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
