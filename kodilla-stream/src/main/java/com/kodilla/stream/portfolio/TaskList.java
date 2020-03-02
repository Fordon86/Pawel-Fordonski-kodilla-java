package com.kodilla.stream.portfolio;

import java.util.LinkedList;
import java.util.List;

public class TaskList {
    private final List<Task> tasks = new LinkedList<>();
    private final String name;

    public TaskList(final String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return new LinkedList<>(tasks);
    }

    public String getName() {
        return name;
    }

    public void addTask (Task task){
        tasks.add(task);
    }

    public boolean removeTask(){
        return tasks.remove(tasks);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskList)) return false;

        TaskList taskList = (TaskList) o;

        if (tasks != null ? !tasks.equals(taskList.tasks) : taskList.tasks != null) return false;
        return name != null ? name.equals(taskList.name) : taskList.name == null;
    }

    @Override
    public int hashCode() {
        int result = tasks != null ? tasks.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
