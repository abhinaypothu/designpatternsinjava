package com.dp.structural.bridge;

public class Producer implements Workshop{
    @Override
    public void work() {
        System.out.print("Producer ");
    }
}
