package com.dp.creational.builder;

public class BuilderExample {
    public static void main(String[] args) {
        StudentInterf studentInterf = StudentBuilder.builder().age(34).classNum(12).name("dp").build();
        System.out.println(studentInterf.toString());
    }
}