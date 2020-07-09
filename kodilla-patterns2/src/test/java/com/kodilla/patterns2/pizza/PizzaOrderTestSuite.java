package com.kodilla.patterns2.pizza;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = theOrder.getPizzaPrice();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getPizzaDescription();
        //Then
        assertEquals("Basic pizza", description);
    }

    @Test
    public void testPizzaCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new PepperDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getPizzaPrice();
        //Then
        assertEquals(new BigDecimal(45), cost);
    }

    @Test
    public void testPizzaDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new PepperDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        //When
        String description = theOrder.getPizzaDescription();
        //Then
        assertEquals("Basic pizza with add cheese with add salami with add pepper with add onion", description);
    }



}
