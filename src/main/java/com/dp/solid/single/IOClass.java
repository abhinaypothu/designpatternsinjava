package com.dp.solid.single;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IOClass {
    IOClass(){}
    public List<Integer> read(){
        return Arrays.asList(44,33,66,44,99,368,11,0,77,33);
    }
    public void write(List<Integer> list){
        Consumer<Integer> consumer = System.out::println;
        list.stream().forEach(consumer);
    }
}
