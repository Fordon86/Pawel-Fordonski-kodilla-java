package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsCalculateTest {
    @Test
    public void advStatisticsCalculateTestWithZeroMock() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 0; i++) {
            usersNames.add("Johan" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        statisticsCalculator.calculateAdvStatistic(statisticsMock);
        //Then
        Assert.assertEquals(0.0,statisticsCalculator.getAverageCommentsPerPost(), 0.0001);
        Assert.assertEquals(0.0,statisticsCalculator.getAveragePostPerUser(), 0.0001);
        Assert.assertEquals(0.0,statisticsCalculator.getAverageCommentsPerUser(), 0.0001);
    }

    @Test
    public void advStatisticsCalculateTestWith1000Users() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            usersNames.add("Johan" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.postsCount()).thenReturn(250);
        //When
        statisticsCalculator.calculateAdvStatistic(statisticsMock);
        //Then
        Assert.assertEquals(2.0,statisticsCalculator.getAverageCommentsPerPost(), 0.0001);
        Assert.assertEquals(0.25,statisticsCalculator.getAveragePostPerUser(), 0.0001);
        Assert.assertEquals(0.5,statisticsCalculator.getAverageCommentsPerUser(), 0.0001);
    }
    @Test
    public void advStatisticsCalculateTestWith100Users() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            usersNames.add("Johan" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(250);
        when(statisticsMock.postsCount()).thenReturn(500);
        //When
        statisticsCalculator.calculateAdvStatistic(statisticsMock);
        //Then
        Assert.assertEquals(0.5,statisticsCalculator.getAverageCommentsPerPost(), 0.0001);
        Assert.assertEquals(0.5,statisticsCalculator.getAveragePostPerUser(), 0.0001);
        Assert.assertEquals(0.25,statisticsCalculator.getAverageCommentsPerUser(), 0.0001);
    }

}
