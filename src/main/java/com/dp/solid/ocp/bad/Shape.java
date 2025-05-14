package com.dp.solid.ocp.bad;

public class Shape {
    public double area(String shape,int value){
        if(shape.equalsIgnoreCase("circle")){
            return 3.14 * value * value;
        }
        else if(shape.equalsIgnoreCase("square")){
            return value * value;
        }
        else{
            return 0;
        }
    }
}
