package com.sky.maven;
import com.sky.demo.Calculator;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello Maven.");

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 2));
    }
}
