package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Drive 1000 kilometers",drivingTask.getTaskName());
        Assert.assertEquals(true,drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Portrait of me",paintingTask.getTaskName());
        Assert.assertEquals(true,paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryRectangle() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("buy summer clothes",shoppingTask.getTaskName());
        Assert.assertEquals(true,shoppingTask.isTaskExecuted());
    }
}
