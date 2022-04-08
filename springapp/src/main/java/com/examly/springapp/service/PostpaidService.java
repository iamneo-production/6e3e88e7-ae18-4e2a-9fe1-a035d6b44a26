package com.examly.springapp.service;

import com.examly.springapp.exception.UserNotFoundException;
import com.examly.springapp.model.Postpaid;
import com.examly.springapp.repository.PostpaidRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PostpaidService {
    private final PostpaidRepo postpaidRepo;

    @Autowired
    public PostpaidService(PostpaidRepo postpaidRepo) {
        this.postpaidRepo = postpaidRepo;
    }

    public Postpaid addPostpaidPlan(Postpaid postpaid) {
        return postpaidRepo.save(postpaid);
    }
    public List<Postpaid> findAllPostpaidPlan() {return postpaidRepo.findAll(); }

    public Postpaid updatePostpaidPlan(Postpaid postpaid){ return postpaidRepo.save(postpaid); }

    public Postpaid findPostpaidPlanById(Long id){
        return postpaidRepo.findPostpaidPlanById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id "+id+" was not found"));
    }

    public void deleteById(Long id){ postpaidRepo.deleteById(id);}
}
