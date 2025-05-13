package com.dp.behavioural.chainofresponsibility;

public class NumberCannotAdded implements AddTwoNumbers{
    @Override
    public void add(String number1, String number2) {
        System.out.println("Number cannot be added");
    }
}
