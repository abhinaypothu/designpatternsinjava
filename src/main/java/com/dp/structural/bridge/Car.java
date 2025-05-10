package com.dp.structural.bridge;


public class Car extends Vehicle {
    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1,workshop2);
    }
    @Override
    public void work() {
        System.out.print("Car ");
        super.workshop1.work();
        super.workshop2.work();
    }
}
