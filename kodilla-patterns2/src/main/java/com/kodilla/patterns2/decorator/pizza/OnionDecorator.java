package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OnionDecorator extends AbstractPizzaOrderDecorator {

    public OnionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaPrice () {
        return super.getPizzaPrice().add(new BigDecimal(7));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " with add onion";
    }

}
