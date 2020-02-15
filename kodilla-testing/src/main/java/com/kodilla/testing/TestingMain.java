package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(9,5);
        int resultSubtract = calculator.subtract(5,9);

        System.out.println(resultAdd);
        if (resultAdd == 14) {
            System.out.println("Test ok");
        }
        else{
            System.out.println("Error!");
        }

        System.out.println(resultSubtract);
        if (resultSubtract == -4) {
            System.out.println("Test ok");
        }
        else{
            System.out.println("Error!");
        }

    }
}