package com.kodilla.testing.calculator;

public class Calculator {

    private int add;
    private int subtract;

    public int add(int a, int b){
        add = a + b;
        return add;
    }

    public int subtract (int a, int b){
        subtract = a - b;
        return subtract;
    }

}
