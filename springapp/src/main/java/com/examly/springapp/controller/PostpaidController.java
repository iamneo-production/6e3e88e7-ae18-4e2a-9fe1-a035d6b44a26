package com.examly.springapp.controller;

import com.examly.springapp.model.Postpaid;
import com.examly.springapp.service.PostpaidService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postpaid-plan")
public class PostpaidController {
    private final PostpaidService postpaidService;

    public PostpaidController(PostpaidService postpaidService) {
        this.postpaidService = postpaidService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Postpaid>> getAllPostpaidPlan(){
        List<Postpaid> postpaidPlans= postpaidService.findAllPostpaidPlan();
        return new ResponseEntity<>(postpaidPlans, HttpStatus.OK);
    }
    @CrossOrigin(origins = "https://8081-acaffdedcaeaacdacfbbecdaadaeac.examlyiopb.examly.io")
    @GetMapping("/find/{id}")
    public ResponseEntity<Postpaid> getPostpaidPlanById(@PathVariable("id") Long id){
        Postpaid postpaidPlan= postpaidService.findPostpaidPlanById(id);
        return new ResponseEntity<>(postpaidPlan, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Postpaid> addPostpaidPlan(@RequestBody Postpaid postpaid){
        Postpaid newPostpaidPlan = postpaidService.addPostpaidPlan(postpaid);
        return new ResponseEntity<>(newPostpaidPlan, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Postpaid> updatePostpaidPlan(@PathVariable("id") Long id,@RequestBody Postpaid postpaid){
        Postpaid updatePlan = postpaidService.updatePostpaidPlan(postpaid);
        return new ResponseEntity<>(updatePlan, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePostpaidPlan(@PathVariable("id") Long id){
        postpaidService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
