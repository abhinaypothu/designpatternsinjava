package com.dp.structural.composite.anotherexample;

public class SoftwareEngineer implements Employee{
    String name;
    Designation designation;
    int salary;
    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public SoftwareEngineer(String name,Designation designation,int salary){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public Designation getDesignation() {
        return this.designation;
    }
}
