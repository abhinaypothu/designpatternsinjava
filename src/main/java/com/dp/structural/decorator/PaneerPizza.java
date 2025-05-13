package com.dp.structural.decorator;

public class PaneerPizza extends PizzaDecorator{
    public PaneerPizza(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String make() {
        return super.make()+" Paneer";
    }
}
