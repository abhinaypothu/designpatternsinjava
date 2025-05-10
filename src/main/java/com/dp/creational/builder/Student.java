package com.dp.creational.builder;

public class Student implements StudentInterf {
    String name;
    int age;
    int classNum;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setClass(int classNum) {
        this.classNum = classNum;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classNum=" + classNum +
                '}';
    }
}
