package com.dp.prototype;

public class ShapePrototype {
    private Shape shape;
    public ShapePrototype(Shape shape)
    {
        this.shape = shape;
    }

    public Shape clone(){
        return shape.clone();
    }

}
