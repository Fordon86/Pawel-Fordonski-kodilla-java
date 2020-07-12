package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHomework {
    private final String studentName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.studentName = mentorName;
    }
    @Override
    public void update(StudentTask studentTask) {
        System.out.println(studentName + " : student add new task to check " + studentTask.getStudentName() + "\n" +
                " (total: " + studentTask.getHomework().size() + " task to check)");
        updateCount++;
    }
    public String getStudentName() {
        return studentName;
    }
    public int getUpdateCount() {
        return updateCount;
    }
}
