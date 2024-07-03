package com.juci.firstapi.controller;

import com.juci.firstapi.entities.User;
import com.juci.firstapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User post(@RequestBody User user){
        User result = userRepository.save(user);
        return result;
    }

    @GetMapping
    public List<User>getAllUsers(){
        List<User> result = userRepository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable Long id){
        User result = userRepository.findById(id).get();
        return result;
    }




}
