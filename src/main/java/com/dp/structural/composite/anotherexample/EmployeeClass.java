package com.dp.structural.composite.anotherexample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClass implements Employee{
    String name;
    int salary;
    Designation designation;
    List<Employee>employees;
    public EmployeeClass(String name,int salary,Designation designation){
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.employees = new ArrayList<>();
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public Designation getDesignation() {
        return this.designation;
    }
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
    public Employee getEmployee(int index){return this.employees.get(index);};
}
