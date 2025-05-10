package com.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Task{
    String taskName;
    List<Task> tasks = new ArrayList<>();
    public TaskList(String taskName) {
        this.taskName = taskName;
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    public void printAllTasks()
    {
        for(Task task: tasks)
        {
            System.out.println(task.getTaskName());
        }
    }
}
