package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask(){
        return taskName;
    }

    @Override
    public String getTaskName(){
        return "[Where to go : ] + where + [ by ] + using";
    }
    @Override
    public Boolean isTaskExecuted(){
        return false;
    }

}
