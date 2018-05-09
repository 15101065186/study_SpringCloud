package com.example.demo.controller;

import com.example.demo.entity.Girl;
import com.example.demo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GirlController {

    @Autowired
    private GirlService girlService;
    //@GetMapping
    @RequestMapping(value = "/One/{id}",method = RequestMethod.GET)
    public Girl getGirl(@PathVariable Integer id){
        return girlService.queryOne(id);
    }
}
