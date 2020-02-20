package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.StatisticsCalculator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsCalculateTest {
    @Test
    public void advStatisticsCalculateTestWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<String>();
        usersNames.add("Johan");
        usersNames.add("Frank");
        usersNames.add("Tom");

        //When

        //Then

    }

}
