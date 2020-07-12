package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTask implements ObservableHomework{
    private final List<ObserverHomework> observerHomeworks;
    private final String studentName;
    private final List<String> homework;

    public StudentTask(String studentName) {
        homework = new ArrayList<>();
        observerHomeworks = new ArrayList<>();
        this.studentName = studentName;
    }
    public void addTask (String task) {
        homework.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver (ObserverHomework observerHomework) {
        observerHomeworks.add(observerHomework);
    }
    @Override
    public void notifyObservers() {
        for (ObserverHomework observerHomework : observerHomeworks) {
            observerHomework.update(this);
        }
    }
    public String getStudentName() {
        return studentName;
    }

    public List<String> getHomework() {
        return homework;
    }

}
