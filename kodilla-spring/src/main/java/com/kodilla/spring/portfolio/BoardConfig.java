package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("tasksToDo")
    private TaskList tasksToDo;
    @Qualifier("tasksInProgress")
    private TaskList tasksInProgress;
    @Autowired
    @Qualifier("tasksDone")
    private TaskList tasksDone;

    @Bean
    public Board getBoard (){
        Board board = new Board();
        board.setToDoList(tasksToDo);
        board.setInProgressList(tasksInProgress);
        board.setDoneList(tasksDone);

        return board;
    }
    @Bean(name = "tasksToDo")
    @Scope("prototype")
    protected TaskList getTaskToDo (){
        List<String> taskToDoList = new ArrayList<>();
        taskToDoList.add("Task_1");
        taskToDoList.add("Task_2");
        taskToDoList.add("Task_3");
        TaskList taskListToDo = new TaskList();
        taskListToDo.setTasks(taskToDoList);
        return taskListToDo ;
    }

    @Bean(name = "tasksInProgress")
    @Scope("prototype")
    protected TaskList getTaskInProgress (){
        List<String> taskInProgressList = new ArrayList<>();
        taskInProgressList.add("Task_4");
        taskInProgressList.add("Task_5");
        taskInProgressList.add("Task_6");
        TaskList taskListInProgress = new TaskList();
        taskListInProgress.setTasks(taskInProgressList);
        return taskListInProgress ;
    }

    @Bean(name = "tasksDone")
    @Scope("prototype")
    protected TaskList getDone (){
        List<String> taskDoneList = new ArrayList<>();
        taskDoneList.add("Task_7");
        taskDoneList.add("Task_8");
        taskDoneList.add("Task_9");
        TaskList taskListDone = new TaskList();
        taskListDone.setTasks(taskDoneList);
        return taskListDone ;
    }

}
