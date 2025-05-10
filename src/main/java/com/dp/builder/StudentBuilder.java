package com.dp.builder;

public class StudentBuilder {
    StudentInterf student;
    public StudentBuilder(){
        student = new Student();
    }
    static StudentBuilder builder(){
        return new StudentBuilder();
    }
    public StudentInterf build(){
        return student;
    }
    public StudentBuilder name(String name){
        student.setName(name);
        return this;
    }
    public StudentBuilder age(int age){
        student.setAge(age);
        return this;
    }
    public StudentBuilder classNum(int classNum){
        student.setClass(classNum);
        return this;
    }
}