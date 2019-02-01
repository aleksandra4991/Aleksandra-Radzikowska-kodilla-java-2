package com.kodilla.testing.forum.statistics.mock.stastics.stub;

import com.kodilla.testing.forum.statistics.AdvStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

    public class AdvStatisticsTestSuite {

        @Test
        public void testShowStatisticsWithMockWithPostsCountEqualToZero() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            int postsCount = 0;
            when(statisticsMock.postsCount()).thenReturn(postsCount);
            AdvStatistics countingStatistics = new AdvStatistics(statisticsMock);
            countingStatistics.calculateAdvStatistics(statisticsMock);

            //When
            double averagePostsPerUser = countingStatistics.getAverageQuantityOfPostsPerUser();


            //Then
            Assert.assertTrue( 0==averagePostsPerUser);

        }

        @Test
        //has to fail due the fact there is no possibility to divide by 0
        public void testShowStatisticsWithMockWithPostsCountEqualTo1000() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersNames = mock(List.class);

            int amountOfUsers=100;
            when(usersNames.size()-1).thenReturn(amountOfUsers);

            int postsCount = 1000;
            when(statisticsMock.postsCount()).thenReturn(postsCount);


            AdvStatistics countingStatistics = new AdvStatistics(statisticsMock);
            countingStatistics.calculateAdvStatistics(statisticsMock);

            //When
            double averagePostsPerUser = countingStatistics.getAverageQuantityOfPostsPerUser();


            //Then
            Assert.assertTrue((double)10.0==(double)averagePostsPerUser);

        }


    }