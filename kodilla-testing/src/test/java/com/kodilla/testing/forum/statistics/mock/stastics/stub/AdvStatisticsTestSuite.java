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
        public void testShowStatisticsWithMockWithpostsCountEqualToZero() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            int postsCount = 0;
            when(statisticsMock.postsCount()).thenReturn(postsCount);

            AdvStatistics advStatistics = new AdvStatistics(null, 0, 0);


            //When
            Integer showedPostsCount = advStatistics.postsCount();


            //Then
            Assert.assertTrue( 0==showedPostsCount);

        }


        @Test
        public void testShowStatisticsWithMockWithpostsCountEqualTo1000() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            int postsCount = 1000;
            when(statisticsMock.postsCount()).thenReturn(postsCount);

            AdvStatistics advStatistics = new AdvStatistics(null, 1000, 0);


            //When
            Integer showedPostsCount = advStatistics.postsCount();


            //Then
            Assert.assertTrue( 1000==showedPostsCount);

        }


    }