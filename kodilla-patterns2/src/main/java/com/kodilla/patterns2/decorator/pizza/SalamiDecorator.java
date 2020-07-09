package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaOrderDecorator {

    public SalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaPrice () {
        return super.getPizzaPrice().add(new BigDecimal(10));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " with add salami";
    }

}
