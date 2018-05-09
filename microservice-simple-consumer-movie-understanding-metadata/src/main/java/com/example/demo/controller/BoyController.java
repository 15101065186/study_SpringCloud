package com.example.demo.controller;

import com.example.demo.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BoyController {
    @Autowired
   private RestTemplate restTemplate;



    @GetMapping("One/{id}")
    public Girl getGirl(@PathVariable Integer id){
        return restTemplate.getForObject("http://localhost:9100/One/"+id,Girl.class);
    }

}
