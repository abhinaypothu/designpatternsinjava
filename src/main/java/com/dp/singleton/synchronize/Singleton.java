package com.dp.singleton.synchronize;

public class Singleton {
    private Singleton(){
        System.out.println("Singleton is created");
    }
    private static Singleton instance = null;
    public static synchronized Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class) {
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
