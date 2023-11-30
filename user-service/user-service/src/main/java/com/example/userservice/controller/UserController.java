package com.example.userservice.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @TimeStamp 2023-11-23 18:17
 * @ProjectDetails user-service
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/save")
    public String saveUser(){
        return "saved user!";
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        System.out.println(user.getAddress());
        user.setAddress("New Address");
        return user;

    }
}
