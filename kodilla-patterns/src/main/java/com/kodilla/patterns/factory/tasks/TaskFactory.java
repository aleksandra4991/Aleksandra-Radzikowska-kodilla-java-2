package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Drive 1000 kilometers","in Europe","bike");
            case PAINTINGTASK:
                return new PaintingTask("Portrait of me","blach-white","pencil");
            case SHOPPINGTASK:
                return new ShoppingTask("buy summer clothes","dresses",5.0);
            default:
                return null;
        }

    }
}
