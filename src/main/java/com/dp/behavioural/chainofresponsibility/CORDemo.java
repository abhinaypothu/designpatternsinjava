package com.dp.behavioural.chainofresponsibility;

public class CORDemo {
    public static void main(String[] args) {
        AddTwoNumbers ntn = new NumberCannotAdded();
        AddTwoNumbers ftn = new FloatAddTwoNumbers(ntn);
        AddTwoNumbers atn = new IntAddTwoNumbers(ftn);

        atn.add("10", "20");

        atn.add("10.5", "20.5");

        atn.add("qw","rr");
    }
}
