package com.example.demo.controller;

import com.example.demo.model.CustomerModel;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegisterationController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("/register")
    public String registerCustomer(@RequestBody CustomerModel customerModel)
    {
       customerService.registerCustomer(customerModel);

        return "Success";
    }

    @PostMapping("/login")
    public String loginCustomer(@RequestBody CustomerModel customerModel)
    {
        customerService.loginCustomer(customerModel);

        return "u r logged in";
    }

}
