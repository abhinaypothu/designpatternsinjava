package com.dp.structural.decorator;

public class ChickenPizza extends PizzaDecorator{
    public ChickenPizza(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String make() {
        return super.make()+"/Chicken";
    }
}
