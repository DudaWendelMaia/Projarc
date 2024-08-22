package com.projarc.exercicio.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") 
public class MathController { 
    @PostMapping("/sum") 
    public int sum(@RequestParam int num1, @RequestParam int num2) { 
        return num1 + num2; 
    } 
}
