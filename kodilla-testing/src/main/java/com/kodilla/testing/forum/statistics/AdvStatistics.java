package com.kodilla.testing.forum.statistics;

import java.util.*;
import java.lang.*;
import java.io.*;

public class AdvStatistics {

    Statistics statistics;
    double averageQuantityOfPostsPerUser;
    double averageQuantityOfCommentsPerUser;
    double averageQuantityOfCommentsPerPost;


    public AdvStatistics(Statistics statistics) {
        this.statistics = statistics;
        this.averageQuantityOfPostsPerUser = 0;
        this.averageQuantityOfCommentsPerUser = 0;
        this.averageQuantityOfCommentsPerPost = 0;
    }

    public double getAverageQuantityOfPostsPerUser() {
        return averageQuantityOfPostsPerUser;
    }

    public double getAverageQuantityOfCommentsPerUser() {
        return averageQuantityOfCommentsPerUser;
    }

    public double getAverageQuantityOfCommentsPerPost() {
        return averageQuantityOfCommentsPerPost;
    }


    public double postsCount() {
        double postsCount=statistics.postsCount();
        return postsCount;
    }

    public double commentsCount() {
        double commentsCount=statistics.commentsCount();
        return commentsCount;
    }

    public double countUsers(){
        double amountOfUsers=statistics.usersNames().size()-1;
        return amountOfUsers;
    }

    public double countAverageQuantityOfPostsPerUser() {
        double averageQuantityOfPostsPerUser = (postsCount() / countUsers());
        return averageQuantityOfPostsPerUser;
    }

    public double countAverageQuantityOfCommentsPerUser() {
        double averageQuantityOfCommentsPerUser = (commentsCount() / countUsers());
        return averageQuantityOfCommentsPerUser;
    }

        public double countAverageQuantityOfCommentsPerPost(){
        double averageQuantityOfCommentsPerPost=(commentsCount() / postsCount());
        return averageQuantityOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        countAverageQuantityOfPostsPerUser();
        countAverageQuantityOfCommentsPerUser();
        countAverageQuantityOfCommentsPerPost();
    }

    public double showStatistics(Statistics statistics){
        return postsCount() + commentsCount()+ countUsers()+getAverageQuantityOfPostsPerUser()+getAverageQuantityOfCommentsPerUser()+getAverageQuantityOfCommentsPerPost();
    }


}
