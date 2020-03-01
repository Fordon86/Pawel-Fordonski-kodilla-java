package com.kodilla.stream.array;

import org.junit.Test;
import org.junit.Assert;

public class ArrayOperationsTestSuite implements ArrayOperations {
    @Test
    public void testGetAverage (){
        //Given
        int [] numbers = new int[]{2,4,5,2,3,4,5,7,2,3,3,4,5,8,3,2,3,1,7,3};

        //When
        Double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(3.8, result, 0.001);

    }
}
