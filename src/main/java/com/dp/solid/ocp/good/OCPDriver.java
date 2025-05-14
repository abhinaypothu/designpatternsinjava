package com.dp.solid.ocp.good;

public class OCPDriver {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Area of circle is " + circle.area(5));

        Shape square = new Square();
        System.out.println("Area of square is " + square.area(15));

    }
}
