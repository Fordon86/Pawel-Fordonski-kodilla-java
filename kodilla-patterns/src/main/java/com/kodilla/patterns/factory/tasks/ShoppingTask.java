package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask(){
        return taskName;
    }

    @Override
    public String getTaskName(){
        return "[What to buy: ] + whatToBuy + [ ] + quantity";
    }
    @Override
    public Boolean isTaskExecuted(){
        return false;
    }

}
