package com.dp.structural.composite.anotherexample;

public class CompositeExample {
    public static void main(String[] args) {
       EmployeeClass e = new EmployeeClass("Abhi",334412,Designation.CEO);
       Employee sf = new SoftwareEngineer("Raj",Designation.DEVELOPER,22333);
       e.addEmployee(sf);
    }
}
