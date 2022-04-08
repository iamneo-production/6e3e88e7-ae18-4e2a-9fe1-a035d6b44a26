package com.examly.springapp.service;

import com.examly.springapp.exception.UserNotFoundException;
import com.examly.springapp.model.AddOn;
import com.examly.springapp.repository.AddOnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AddOnService {
    private final AddOnRepo addonRepo;

    @Autowired
    public AddOnService(AddOnRepo addonRepo) {
        this.addonRepo = addonRepo;
    }

    public AddOn addAddOnPlan(AddOn addon) {
        return addonRepo.save(addon);
    }
    public List<AddOn> findAllAddOnPlan() {return addonRepo.findAll(); }

    public AddOn updateAddOnPlan(AddOn addon){ return addonRepo.save(addon); }

    public AddOn findAddOnPlanById(Long id){
        return addonRepo.findAddOnPlanById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id "+id+" was not found"));
    }

    public void deleteById(Long id){ addonRepo.deleteById(id);}
}
