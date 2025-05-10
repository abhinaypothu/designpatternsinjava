package com.dp.structural.bridge;

import com.dp.creational.factory.Lorry;

public class BridgeDesignPatternExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Producer(),new Assembler());
        vehicle.work();

        vehicle = new Bike(new Producer(),new Assembler());
        vehicle.work();

    }
}
