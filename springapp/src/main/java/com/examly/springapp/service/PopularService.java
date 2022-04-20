package com.examly.springapp.service;

import com.examly.springapp.exception.UserNotFoundException;
import com.examly.springapp.model.Popular;
import com.examly.springapp.repository.PopularRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PopularService {
    private final PopularRepo popularRepo;

    @Autowired
    public PopularService(PopularRepo popularRepo) {
        this.popularRepo = popularRepo;
    }

    public Popular addPopularPlan(Popular popular) {
        return popularRepo.save(popular);
    }

    public List<Popular> findAllPopularPlan() {return popularRepo.findAll(); }

    public Popular updatePopularPlan(Popular popular){ return popularRepo.save(popular); }
    public Popular findPopularPlanById(Long id){
        return popularRepo.findPopularPlanById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id "+id+" was not found"));
    }
    public void deleteById(Long id){ popularRepo.deleteById(id);}

}
