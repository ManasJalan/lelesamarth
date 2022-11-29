package com.example.demo.controller;

import com.example.demo.repository.CartRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    private CartRepository cartRepository;

    //@PostMapping("/add")




}
