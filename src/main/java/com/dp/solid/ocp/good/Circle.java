package com.dp.solid.ocp.good;

public class Circle implements Shape{
    @Override
    public double area(int value) {
        return 3.14 * value * value;
    }
}
