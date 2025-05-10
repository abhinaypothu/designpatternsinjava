package com.dp.creational.prototype;

public class Circle implements Shape{
    int x,y,radius;
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Circle is drawn at ("+x+","+y+") with radius "+radius);
    }

    @Override
    public Shape clone() {
        return new Circle(x,y,radius);
    }
}
