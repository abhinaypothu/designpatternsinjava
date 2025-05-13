package com.dp.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        IPizza pizza = new PlainPizza();

        PizzaDecorator pizzaDecorator = new ChickenPizza(pizza);
        System.out.println(pizzaDecorator.make());

        PizzaDecorator paneerPizzaDecorator = new PaneerPizza(pizza);
        System.out.println(paneerPizzaDecorator.make());
    }
}
