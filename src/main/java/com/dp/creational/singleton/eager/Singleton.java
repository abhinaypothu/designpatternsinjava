package com.dp.creational.singleton.eager;

public class Singleton {
    private final static Singleton INSTANCE = new Singleton();
    private Singleton(){
        System.out.println("Singleton is created at static final variable creation");
    }
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
