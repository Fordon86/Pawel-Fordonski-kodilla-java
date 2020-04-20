package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask(){
        return taskName;
    }

    @Override
    public String getTaskName(){
        return "[What to paint: ] + whatToPaint + [ and color ] + color";
    }
    @Override
    public Boolean isTaskExecuted(){
        return true;
    }
}
