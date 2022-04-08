package com.examly.springapp.service;

import com.examly.springapp.exception.UserNotFoundException;
import com.examly.springapp.model.User;
import com.examly.springapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUserPlan(User user) {
        return userRepo.save(user);
    }

    public List<User> findAllUserPlan() {return userRepo.findAll(); }

    public User updateUserPlan(User user){ return userRepo.save(user); }
    public User findUserPlanById(Long id){
        return userRepo.findUserPlanById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id "+id+" was not found"));
    }
    public void deleteById(Long id){ userRepo.deleteById(id);}

}