package com.dp.solid.ocp.good;

public class Square implements Shape{
    @Override
    public double area(int value) {
        return value * value;
    }
}
