package com.kodilla.testing.forum.statistics;

import java.util.*;
import java.lang.*;
import java.io.*;

public class AdvStatistics {

    Statistics statistics;

    List<String> usersNames; // list of users names
    int postsCount;          // total quantity of forum posts
    int commentsCount;// total quantity of forum comments

    int numberOfUsers;
    int averageQuantityOfPostsPerUser;
    int averageQuantityOfCommentsPerUser;
    int averageQuantityOfCommentsPerPost;



    public AdvStatistics(List<String> usersNames, int postsCount, int commentsCount) {
        this.usersNames = usersNames;
        this.postsCount = postsCount;
        this.commentsCount = commentsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvStatistics that = (AdvStatistics) o;
        return postsCount() == that.postsCount() &&
                commentsCount() == that.commentsCount() &&
                Objects.equals(usersNames(), that.usersNames());
    }

    @Override
    public int hashCode() {
        return Objects.hash(usersNames(), postsCount(), commentsCount());
    }

    public List<String> usersNames() {
        List<String> usersNames = new ArrayList<String>();
        return usersNames;
    }



    public int postsCount() {
        this.postsCount=postsCount;
        return postsCount;
    }

    public int commentsCount() {
        this.commentsCount=commentsCount;
        return commentsCount;
    }

    public int countUsers(List<String>usersNames){
        this.numberOfUsers=usersNames.size()-1;
        return usersNames.size()-1;
    }

    public int countAverageQuantityOfPostsPerUser(int postsCount,List<String>usersNames) {
        this.averageQuantityOfPostsPerUser=(postsCount / usersNames.size() - 1);
        return (postsCount / usersNames.size() - 1);
        }

    public int countAverageQuantityOfCommentsPerUser(int commentsCount,List<String>usersNames){
        this.averageQuantityOfCommentsPerUser=(commentsCount / usersNames.size()-1);
        return (commentsCount / usersNames.size()-1);
    }

    public int countAverageQuantityOfCommentsPerPost(int commentsCount,int postsCount){
        this.averageQuantityOfCommentsPerPost=(commentsCount / postsCount);
        return (commentsCount / postsCount);
    }

    public void calculateAdcStatistics(Statistics statistics) {
        AdvStatistics calculationOfAdvStatistics = new AdvStatistics(usersNames, postsCount, commentsCount);
        calculationOfAdvStatistics.postsCount();
        calculationOfAdvStatistics.commentsCount();
        calculationOfAdvStatistics.countUsers(usersNames);
        calculationOfAdvStatistics.countAverageQuantityOfPostsPerUser(postsCount, usersNames);
        calculationOfAdvStatistics.countAverageQuantityOfCommentsPerUser(commentsCount, usersNames);
        calculationOfAdvStatistics.countAverageQuantityOfCommentsPerPost(commentsCount, postsCount);
    }

    public int showStatistics(Statistics statistics){
        return postsCount + commentsCount+ (usersNames.size()-1)  +(postsCount / usersNames.size() - 1) +(commentsCount / usersNames.size()-1) +(commentsCount / postsCount);
    }




}
