package com.dp.behavioural.observer;

public class LateralEntryStudents implements Student{
    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
