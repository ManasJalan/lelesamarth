package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.model.CustomerModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/welcome")
    public String hi()
    {

        return "hi homie";
    }
}
