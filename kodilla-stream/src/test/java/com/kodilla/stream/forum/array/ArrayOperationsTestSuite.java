package com.kodilla.stream.forum.array;

import com.kodilla.stream.array.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        //Given
        Array array1 = new Array();

        //When
        int[]arrayNumbers=new int[]{3,7,6,5,9,12,4,4,7,8,11,24,31,12,15,7,4,1,2,9};

        //Then
        (double) averageOfArrayNumbers = IntStream.range(arrayNumbers[0],arrayNumbers[19])
                .average();
        Assert.assertEquals(9.05, averageOfArrayNumbers);

    }
}
