package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperDecorator extends AbstractPizzaOrderDecorator {

    public PepperDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaPrice () {
        return super.getPizzaPrice().add(new BigDecimal(8));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " with add pepper";
    }

}
