package com.dp.behavioural.chainofresponsibility;

public class IntAddTwoNumbers implements AddTwoNumbers{
    AddTwoNumbers next;
    IntAddTwoNumbers(AddTwoNumbers next)
    {
        this.next = next;
    }
    public void setNext(AddTwoNumbers next){
        this.next = next;
    }
    @Override
    public void add(String number1, String number2) {
        try{
            int a = Integer.parseInt(number1);
            int b = Integer.parseInt(number2);
            System.out.println(a+b);
        }
        catch(NumberFormatException nfe){
            next.add(number1, number2);
        }

    }
}
