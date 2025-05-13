package com.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String,Shape> shapes;
    private static String generateShape(int x,int y)
    {
        return x+" "+y;
    }
    public static Shape getShape(int x,int y){
        if(shapes == null)shapes = new HashMap<>();
        if(shapes.containsKey(generateShape(x,y)))
        {
            return shapes.get(generateShape(x,y));
        }
        Shape shape = new Circle(x,y,10);
        shapes.put(generateShape(x,y),shape);
        return shape;
    }

}
