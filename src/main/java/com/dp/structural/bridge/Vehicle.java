package com.dp.structural.bridge;

abstract class Vehicle {
    Workshop workshop1,workshop2;
    Vehicle(Workshop workshop1,Workshop workshop2){
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }
    public abstract void work();
}
