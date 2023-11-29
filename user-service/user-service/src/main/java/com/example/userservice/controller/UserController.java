package com.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
