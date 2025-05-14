package com.dp.solid.lsp;

public abstract class Vehicle {
    int numberOfWheels;
    Vehicle(int numberOfWheels)
    {
        this.numberOfWheels = numberOfWheels;
    }
    public void printNumberOfWheels()
    {
        System.out.println("Number of wheels: " + numberOfWheels);
    }
    public abstract void engineNoise();

}
