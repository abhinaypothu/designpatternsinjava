package com.dp.absfactory.car;

public class BMW implements Car{
    @Override
    public void start() {
        System.out.println("BMW is started");
    }

    @Override
    public void run() {
        System.out.println("BMW is moving");
    }

    @Override
    public void stop() {
        System.out.println("BMW is stopped");
    }
}
