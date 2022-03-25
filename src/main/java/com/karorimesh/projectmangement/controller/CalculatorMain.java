package com.karorimesh.projectmangement.controller;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorController calc = new CalculatorController();
        Double total = calc.sum(10.0 , 4.5);
        System.out.println(total);
    }
}
