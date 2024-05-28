package com.servicediscovery.eureka.client.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DummyController {

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/hi")
    public void doSomething(){
        String output = restTemplate.getForObject("http://user-service/hello", String.class);
        System.out.println(output);
    }
}
