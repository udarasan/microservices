package com.example.emplayeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @TimeStamp 2023-11-23 18:28
 * @ProjectDetails emplayee-service
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/save")
    public String saveEmployee(){
       return restTemplate.getForObject("http://user-service/user/save",String.class);
    }

    @PostMapping("/add")
    public User addUserFromEmployeeEndpoint(@RequestBody User user){
        return restTemplate.postForObject("http://user-service/user/add",user,User.class);
    }
}
