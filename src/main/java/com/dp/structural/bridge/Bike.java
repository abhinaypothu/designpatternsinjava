package com.dp.structural.bridge;

public class Bike extends Vehicle{
    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1,workshop2);
    }

    @Override
    public void work() {
        System.out.print("Bike ");
        super.workshop1.work();
        super.workshop2.work();
    }
}
