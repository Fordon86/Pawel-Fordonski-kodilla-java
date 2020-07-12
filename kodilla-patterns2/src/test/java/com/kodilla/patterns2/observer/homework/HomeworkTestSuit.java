package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HomeworkTestSuit {
    @Test
    public void testUpdate () {
        //Given
        StudentTask task1 = new StudentTask1();
        StudentTask task2 = new StudentTask2();

        Mentor zdzich = new Mentor("Jon");
        Mentor jach = new Mentor("Maria");

        task1.registerObserver(zdzich);
        task1.registerObserver(jach);
        task2.registerObserver(zdzich);

        //When
        task1.addTask("Homework to check");
        task2.addTask("Homework to check");
        //Then

        assertEquals(2,zdzich.getUpdateCount());
        assertEquals(1,jach.getUpdateCount());


    }
}
