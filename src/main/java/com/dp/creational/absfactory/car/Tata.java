package com.dp.creational.absfactory.car;

public class Tata implements Car{
    @Override
    public void start() {
        System.out.println("TATA is started");
    }

    @Override
    public void run() {
        System.out.println("Tata is running");
    }

    @Override
    public void stop() {
        System.out.println("Tata is Stopped");
    }
}
