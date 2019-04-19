package com.kodilla.spring.portfolio;

public class Board {

    private TaskLIst toDoList;
    private TaskLIst inProgressList;
    private TaskLIst doneList;

    public Board(TaskLIst toDoList, TaskLIst inProgressList, TaskLIst doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskLIst getToDoList() {
        return toDoList;
    }

    public TaskLIst getInProgressList() {
        return inProgressList;
    }

    public TaskLIst getDoneList() {
        return doneList;
    }
}
