package com.dp.solid.ocp.bad;

public class OCPBadDriver {
    public static void main(String[] args) {
        System.out.println(new Shape().area("circle",5));
        System.out.println(new Shape().area("square",15));

    }
}
