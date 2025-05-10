package com.dp.prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        Shape shapePrototype = new Circle(5,5,15);

        ShapePrototype prototype = new ShapePrototype(shapePrototype);
        Shape s = prototype.clone();
        s.draw();
        System.out.println(s.hashCode());
        Shape s2 = prototype.clone();
        s2.draw();
        System.out.println(s2.hashCode());

        System.out.println(s == s2);

    }
}
