package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    public Board board(){
        return new Board(toDoList(),inProgressList(),doneList());
    }

    @Bean("toDoList")
    public TaskLIst toDoList(){
        ArrayList<String>toDoList=new ArrayList<String>();
        return new TaskLIst(toDoList);
    }


    @Bean("inProgressList")
    public TaskLIst inProgressList() {
        ArrayList<String>inProgressList=new ArrayList<String>();
        return new TaskLIst(inProgressList);
    }

    @Bean("doneList")
    public TaskLIst doneList() {
        ArrayList<String>doneList=new ArrayList<String>();
        return new TaskLIst(doneList);
    }
}
