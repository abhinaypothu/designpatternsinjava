package com.dp.behavioural.observer;

public class RegularStudent implements Student{
    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
