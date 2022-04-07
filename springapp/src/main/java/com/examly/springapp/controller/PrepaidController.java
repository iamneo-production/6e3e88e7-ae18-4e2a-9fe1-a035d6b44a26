package com.examly.springapp.controller;

import com.examly.springapp.model.Prepaid;
import com.examly.springapp.service.PrepaidService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prepaid-plan")
public class PrepaidController {
    private final PrepaidService prepaidService;

    public PrepaidController(PrepaidService prepaidService) {
        this.prepaidService = prepaidService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Prepaid>> getAllPrepaidPlan(){
        List<Prepaid> prepaidPlans= prepaidService.findAllPrepaidPlan();
        return new ResponseEntity<>(prepaidPlans, HttpStatus.OK);
    }
    @CrossOrigin(origins = "https://8081-acaffdedcaeaacdacfbbecdaadaeac.examlyiopb.examly.io")
    @GetMapping("/find/{id}")
    public ResponseEntity<Prepaid> getPrepaidPlanById(@PathVariable("id") Long id){
        Prepaid prepaidPlan= prepaidService.findPrepaidPlanById(id);
        return new ResponseEntity<>(prepaidPlan, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Prepaid> addPrepaidPlan(@RequestBody Prepaid prepaid){
        Prepaid newPrepaidPlan = prepaidService.addPrepaidPlan(prepaid);
        return new ResponseEntity<>(newPrepaidPlan, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Prepaid> updatePrepaidPlan(@PathVariable("id") Long id,@RequestBody Prepaid prepaid){
        Prepaid updatePlan = prepaidService.updatePrepaidPlan(prepaid);
        return new ResponseEntity<>(updatePlan, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePrepaidPlan(@PathVariable("id") Long id){
        prepaidService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
