package com.examly.springapp.service;

import com.examly.springapp.exception.UserNotFoundException;
import com.examly.springapp.model.Prepaid;
import com.examly.springapp.repository.PrepaidRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PrepaidService {
    private final PrepaidRepo prepaidRepo;

    @Autowired
    public PrepaidService(PrepaidRepo prepaidRepo) {
        this.prepaidRepo = prepaidRepo;
    }

    public Prepaid addPrepaidPlan(Prepaid prepaid) {
        return prepaidRepo.save(prepaid);
    }
    public List<Prepaid> findAllPrepaidPlan() {return prepaidRepo.findAll(); }

    public Prepaid updatePrepaidPlan(Prepaid prepaid){ return prepaidRepo.save(prepaid); }

    public Prepaid findPrepaidPlanById(Long id){
        return prepaidRepo.findPrepaidPlanById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id "+id+" was not found"));
    }

    public void deleteById(Long id){ prepaidRepo.deleteById(id);}
}
