package com.dp.behavioural.observer;

import com.dp.structural.decorator.PaneerPizza;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class NotificationManager {
    List<Student>students;
    NotificationManager()
    {
        students = new ArrayList<>();
    }
    public void addStudent(Student student)
    {
        students.add(student);
    }
    public boolean removeStudent(Student student)
    {
        return students.remove(student);
    }
    public void notifyAllStudents(String message)
    {
        Consumer<Student> consumer =  student -> student.update(message);
        students.forEach(consumer);
    }
}
