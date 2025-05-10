package com.dp.structural.composite;

public class SimpleTask implements Task{
    String taskName;
    public SimpleTask(String taskName) {
        this.taskName = taskName;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
}
