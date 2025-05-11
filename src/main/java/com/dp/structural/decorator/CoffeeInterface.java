package com.dp.structural.decorator;

public interface CoffeeInterface {
    void addCofee(CoffeeInterface ci);
    String getCoffeeName();
    int getCoffeePrice();
}
