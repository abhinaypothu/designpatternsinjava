package com.dp.structural.decorator;

public abstract class PizzaDecorator implements IPizza{
    protected IPizza pizza;
    public PizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String make() {
        return pizza.make();
    }
}
