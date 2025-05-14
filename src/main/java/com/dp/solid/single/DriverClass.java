package com.dp.solid.single;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
    public static void main(String[] args) {
        IOClass ioClass = new IOClass();
        List<Integer> list = ioClass.read();
        Sorting sorting = new Sorting(new ArrayList<>(list));
        list = sorting.sort();
        ioClass.write(list);
    }
}
