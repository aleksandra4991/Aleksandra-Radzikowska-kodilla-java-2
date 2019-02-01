package com.kodilla.testing.forum.statistics.mock.stastics.stub;

import com.kodilla.testing.forum.statistics.AdvStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.NaN;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

    public class AdvStatisticsTestSuite {

        @Test
        public void testShowStatisticsWithMockWithPostsCountEqualToZero() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersNames = mock(List.class);

            int postsCount = 0;
            when(statisticsMock.postsCount()).thenReturn(postsCount);

            int amountOfUsers=25;
            when(usersNames.size()).thenReturn(amountOfUsers);
            when(statisticsMock.usersNames()).thenReturn(usersNames);

            AdvStatistics countingStatistics = new AdvStatistics(statisticsMock);
            countingStatistics.calculateAdvStatistics(statisticsMock);

            //When
            double averagePostsPerUser = countingStatistics.getAverageQuantityOfPostsPerUser();


            //Then
            Assert.assertTrue(0.0==averagePostsPerUser);
        }

        @Test
        public void testShowStatisticsWithMockWithPostsCountEqualTo1000() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersNames = mock(List.class);

            int amountOfUsers=25;
            when(usersNames.size()).thenReturn(amountOfUsers);
            when(statisticsMock.usersNames()).thenReturn(usersNames);

            int postsCount = 1000;
            when(statisticsMock.postsCount()).thenReturn(postsCount);


            AdvStatistics countingStatistics = new AdvStatistics(statisticsMock);
            countingStatistics.calculateAdvStatistics(statisticsMock);

            //When
            double averagePostsPerUser = countingStatistics.getAverageQuantityOfPostsPerUser();


            //Then
            Assert.assertEquals(40.0,averagePostsPerUser,0.1);

        }


        @Test
        public void testShowStatisticsWithMockWithCommentsCountEqualTo0() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);

            int postsCount = 1000;
            when(statisticsMock.postsCount()).thenReturn(postsCount);

            int commentsCount = 0;
            when(statisticsMock.commentsCount()).thenReturn(commentsCount);

            AdvStatistics countingStatistics = new AdvStatistics(statisticsMock);
            countingStatistics.calculateAdvStatistics(statisticsMock);

            //When
            double averageCommentsPerPost = countingStatistics.getAverageQuantityOfCommentsPerPost();

            //Then
            Assert.assertEquals(0.0,averageCommentsPerPost,0.1);

        }

        @Test
        public void testShowStatisticsWithMockWithNumberOfCommentsBiggerThanNumberOfPosts() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);

            int postsCount = 200;
            when(statisticsMock.postsCount()).thenReturn(postsCount);

            int commentsCount = 500;
            when(statisticsMock.commentsCount()).thenReturn(commentsCount);

            AdvStatistics countingStatistics = new AdvStatistics(statisticsMock);
            countingStatistics.calculateAdvStatistics(statisticsMock);

            //When
            double averageCommentsPerPost = countingStatistics.getAverageQuantityOfCommentsPerPost();

            //Then
            Assert.assertTrue(2.5==averageCommentsPerPost);

        }

        @Test
        public void testShowStatisticsWithMockWithAmountOfUsersEqualToZero() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersNames = mock(List.class);

            int postsCount = 100;
            when(statisticsMock.postsCount()).thenReturn(postsCount);

            int amountOfUsers=0;
            when(usersNames.size()).thenReturn(amountOfUsers);
            when(statisticsMock.usersNames()).thenReturn(usersNames);

            AdvStatistics countingStatistics = new AdvStatistics(statisticsMock);
            countingStatistics.calculateAdvStatistics(statisticsMock);

            //When
            double averagePostsPerUser = countingStatistics.getAverageQuantityOfPostsPerUser();


            //Then
            Assert.assertFalse(0.0==averagePostsPerUser);

        }

        @Test
        public void testShowStatisticsWithMockWithAmountOfUsersEqualTo100() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersNames = mock(List.class);

            int postsCount = 0;
            when(statisticsMock.postsCount()).thenReturn(postsCount);

            int amountOfUsers=100;
            when(usersNames.size()).thenReturn(amountOfUsers);
            when(statisticsMock.usersNames()).thenReturn(usersNames);

            AdvStatistics countingStatistics = new AdvStatistics(statisticsMock);
            countingStatistics.calculateAdvStatistics(statisticsMock);

            //When
            double averagePostsPerUser = countingStatistics.getAverageQuantityOfPostsPerUser();


            //Then
            Assert.assertTrue(0.0==averagePostsPerUser);

        }

    }