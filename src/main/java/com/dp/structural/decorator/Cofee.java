package com.dp.structural.decorator;

public class Cofee implements CoffeeInterface{
    String name;
    int price;

    @Override
    public void addCofee(CoffeeInterface ci) {
        this.name = this.name + " " + ci.getCoffeeName();
        this.price+= ci.getCoffeePrice();
    }
    @Override
    public String getCoffeeName() {
        return this.name;
    }
    @Override
    public int getCoffeePrice() {
        return this.price;
    }

}
