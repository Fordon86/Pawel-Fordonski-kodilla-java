package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard (){
        Board board = new Board();
        board.setToDoList(getTaskToDo());
        board.setToDoList(getTaskInProgress());
        board.setToDoList(getDone());

        return board;
    }

    private TaskList getTaskToDo (){
        List<String> taskToDoList = new ArrayList<>();
        taskToDoList.add("Task_1");
        taskToDoList.add("Task_2");
        taskToDoList.add("Task_3");
        TaskList taskListToDo = new TaskList(taskToDoList);
        return taskListToDo ;
    }

    private TaskList getTaskInProgress (){
        List<String> taskInProgressList = new ArrayList<>();
        taskInProgressList.add("Task_4");
        taskInProgressList.add("Task_5");
        taskInProgressList.add("Task_6");
        TaskList taskListInProgress = new TaskList(taskInProgressList);
        return taskListInProgress ;
    }

    private TaskList getDone (){
        List<String> taskDoneList = new ArrayList<>();
        taskDoneList.add("Task_7");
        taskDoneList.add("Task_8");
        taskDoneList.add("Task_9");
        TaskList taskListDone = new TaskList(taskDoneList);
        return taskListDone ;
    }

}
