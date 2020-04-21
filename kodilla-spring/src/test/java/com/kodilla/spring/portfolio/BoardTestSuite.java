package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        //Then
        Assert.assertEquals(3, board.getToDoList().getTasks().size());
        Assert.assertEquals(3, board.getInProgressList().getTasks().size());
        Assert.assertEquals(3, board.getDoneList().getTasks().size());
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("New task");
        board.getInProgressList().getTasks().add("New task");
        board.getDoneList().getTasks().add("New task");
        //Then
        Assert.assertEquals(4, board.getToDoList().getTasks().size());
        Assert.assertEquals("New task", board.getToDoList().getTasks().get(3));
        Assert.assertEquals(4, board.getInProgressList().getTasks().size());
        Assert.assertEquals("New task", board.getInProgressList().getTasks().get(3));
        Assert.assertEquals(4, board.getDoneList().getTasks().size());
        Assert.assertEquals("New task", board.getDoneList().getTasks().get(3));
    }

}
