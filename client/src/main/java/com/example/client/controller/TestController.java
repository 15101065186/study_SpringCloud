package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: libo
 * @Mail: libo@sudiyi.cn
 * @Date: 2018/9/11 15:44
 * @Version: 1.1.5
 * @Description:
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    @GetMapping("/from")
    public String from(){
        return this.from;
    }
}
