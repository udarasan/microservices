package com.example.emplayeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
       return restTemplate.getForObject("http://localhost:8083/user/save",String.class);
    }
}
