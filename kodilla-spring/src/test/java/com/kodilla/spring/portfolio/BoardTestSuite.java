package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {

    public void testTaskAdd() {
        @Test
        public void testMethodsAdding () {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
            Board board = context.getBean(Board.class);

            //When
        }
    }
}
