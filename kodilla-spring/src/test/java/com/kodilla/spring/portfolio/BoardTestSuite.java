package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Board board = context.getBean(Board.class);

            //When
            List<String>doneTasks = new ArrayList<>();
            List<String>inProgressTasks = new ArrayList<>();
            List<String>toDoTasks = new ArrayList<>();
            doneTasks.add("cooking dinner");
            inProgressTasks.add("learning java");
            toDoTasks.add("go to Bali");
            board.getDoneList().getTasks().add(doneTasks.get(0));
            board.getInProgressList().getTasks().add(inProgressTasks.get(0));
            board.getToDoList().getTasks().add(toDoTasks.get(0));

            //Then
            board.getDoneList().getTasks().stream()
                    .forEach(System.out::println);
            board.getInProgressList().getTasks().stream()
                    .forEach(System.out::println);
            board.getToDoList().getTasks().stream()
                .forEach(System.out::println);

        }
    }

