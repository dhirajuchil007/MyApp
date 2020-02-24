package com.example.myapp;

public class Task {
    int priority;
    String taskName;

    public Task(int priority, String taskName) {
        this.priority = priority;
        this.taskName = taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
