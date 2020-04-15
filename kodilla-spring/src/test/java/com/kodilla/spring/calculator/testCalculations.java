package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testCalculations {

    @Test
    public void testAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(5,3);
        //Then
        Assert.assertEquals(8, addResult, 0.01);
    }

    @Test
    public void testSub(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean(Calculator.class);
        //When
        double addResult = calculator.sub(5,3);
        //Then
        Assert.assertEquals(2, addResult, 0.01);
    }

    @Test
    public void testMul(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean(Calculator.class);
        //When
        double addResult = calculator.mul(5,3);
        //Then
        Assert.assertEquals(15, addResult, 0.01);
    }

    @Test
    public void testDiv(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean(Calculator.class);
        //When
        double addResult = calculator.div(12,3);
        //Then
        Assert.assertEquals(4, addResult, 0.01);
    }

}
