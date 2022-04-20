package com.examly.springapp.controller;

import com.examly.springapp.model.Popular;
import com.examly.springapp.service.PopularService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/popular-plan")
public class PopularController {
    private final PopularService popularService;

    public PopularController(PopularService popularService) {
        this.popularService = popularService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Popular>> getAllPopularPlan(){
        List<Popular> popularPlans= popularService.findAllPopularPlan();
        return new ResponseEntity<>(popularPlans, HttpStatus.OK);
    }
    @CrossOrigin(origins = "https://8081-acaffdedcaeaacdacfbbecdaadaeac.examlyiopb.examly.io")
    @GetMapping("/find/{id}")
    public ResponseEntity<Popular> getPopularPlanById(@PathVariable("id") Long id){
        Popular popularPlan= popularService.findPopularPlanById(id);
        return new ResponseEntity<>(popularPlan, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Popular> addPopularPlan(@RequestBody Popular popular){
        Popular newPopularPlan = popularService.addPopularPlan(popular);
        return new ResponseEntity<>(newPopularPlan, HttpStatus.CREATED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Popular> updatePopularPlan(@PathVariable("id") Long id,@RequestBody Popular popular){
        Popular updatePlan = popularService.updatePopularPlan(popular);
        return new ResponseEntity<>(updatePlan, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePopularPlan(@PathVariable("id") Long id){
        popularService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
