package com.examly.springapp.controller;

import com.examly.springapp.model.AddOn;
import com.examly.springapp.service.AddOnService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addon-plan")
public class AddOnController {
    private final AddOnService addonService;

    public AddOnController(AddOnService addonService) {
        this.addonService = addonService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<AddOn>> getAllAddOnPlan(){
        List<AddOn> addonPlans= addonService.findAllAddOnPlan();
        return new ResponseEntity<>(addonPlans, HttpStatus.OK);
    }
    @CrossOrigin(origins = "https://8081-acaffdedcaeaacdacfbbecdaadaeac.examlyiopb.examly.io")
    @GetMapping("/find/{id}")
    public ResponseEntity<AddOn> getAddOnPlanById(@PathVariable("id") Long id){
        AddOn addonPlan= addonService.findAddOnPlanById(id);
        return new ResponseEntity<>(addonPlan, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<AddOn> addAddOnPlan(@RequestBody AddOn addon){
        AddOn newAddOnPlan = addonService.addAddOnPlan(addon);
        return new ResponseEntity<>(newAddOnPlan, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AddOn> updateAdminPlan(@PathVariable("id") Long id,@RequestBody AddOn addon){
        AddOn updatePlan = addonService.updateAddOnPlan(addon);
        return new ResponseEntity<>(updatePlan, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAdminPlan(@PathVariable("id") Long id){
        addonService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
