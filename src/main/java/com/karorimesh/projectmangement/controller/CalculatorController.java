package com.karorimesh.projectmangement.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    @GetMapping("/add")
    public Double sum(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2){
        return num1 + num2;
    }

    @GetMapping("/subtract/{num3}")
    public Double subtract(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2, @PathVariable("num3") Double num3){
        return sum(num1 , num2) - num3;
    }
}
