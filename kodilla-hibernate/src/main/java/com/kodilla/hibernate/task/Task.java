package com.kodilla.hibernate.task;


import com.kodilla.hibernate.tasklist.TaskList;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamedQueries({
        @NamedQuery(
                name = "Task.retrieveLongTasks",
                query = "FROM Task WHERE duration > 10"
        ),
        @NamedQuery(
                name = "Task.retrieveShortTasks",
                query = "FROM Task WHERE duration <= 10"
        ),
        @NamedQuery(
                name = "Task.retrieveTasksWithDurationLongerThan",
                query = "FROM Task WHERE duration > :DURATION"
        )
})

@NamedNativeQuery(
        name = "Task.retrieveTasksWithEnoughTime",
        query = "SELECT * FROM TASKS" +
                " WHERE DATEDIFF(DATE_ADD(CREATED,INTERVAL DURATION DAY), NOW()) > 5 ",
        resultClass = Task.class
)

@Entity
@Table(name="TASKS")
public final class Task {
    private int id;
    private String description;
    private Date created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    private TaskList taskList;

    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    public Task() {
    }

    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="TASKS_FINANCIALS_ID")
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID",unique = true,columnDefinition = "ID")
    public int getId() {
        return id;
    }

    @Column(name="DESCRIPTION",columnDefinition = "description")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name="CREATED",columnDefinition = "created")
    public Date getCreated() {
        return created;
    }

    @Column(name="DURATION",columnDefinition = "duration")
    public int getDuration() {
        return duration;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
}
