package com.dp.behavioural.chainofresponsibility;

public class FloatAddTwoNumbers implements AddTwoNumbers{
    AddTwoNumbers next;
    FloatAddTwoNumbers(AddTwoNumbers next){
        this.next = next;
    }
    @Override
    public void add(String number1, String number2) {
        try{
            float a = Float.parseFloat(number1);
            float b = Float.parseFloat(number2);
            System.out.println(a+b);
        }
        catch(NumberFormatException nfe){
            next.add(number1, number2);
        }
    }
}
