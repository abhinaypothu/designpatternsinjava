package com.dp.structural.filterandcriteria;

public class Person {
    String name;
    Gender gender;
    MarriedStatus marriedStatus;

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public MarriedStatus getMarriedStatus() {
        return marriedStatus;
    }

    Person(String name, Gender gender, MarriedStatus marriedStatus){
        this.name = name;
        this.gender = gender;
        this.marriedStatus = marriedStatus;
    }
    public String toString(){
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", marriedStatus=" + marriedStatus +
                '}';
    }
}
