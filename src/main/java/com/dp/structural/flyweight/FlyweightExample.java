package com.dp.structural.flyweight;

public class FlyweightExample {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(10,10);
        circle.draw();

        circle = ShapeFactory.getShape(20,10);
        circle.draw();

        circle = ShapeFactory.getShape(10,10);
        circle.draw();
        circle = ShapeFactory.getShape(20,10);
        circle.draw();
    }
}
