package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        calculator.add(78.9,22.3);
        calculator.sub(45.1,17.2);
        calculator.mul(25.9,4.7);
        calculator.divide(68.4,25.5);
        //Then
        Assert.assertEquals(101.2,78.9+22.3,0.1);
        Assert.assertEquals(27.9,45.1-17.2,0.1);
        Assert.assertEquals(121.73,25.9*4.7,0.1);
        Assert.assertEquals(2.68,68.4/25.3,0.1);
    }
}
