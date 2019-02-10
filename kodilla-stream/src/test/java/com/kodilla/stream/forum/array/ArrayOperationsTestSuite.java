package com.kodilla.stream.forum.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ArrayOperationsTestSuite{

@Test
public void testGetAverage(){

    //Given
    int[]myNumbers=new int[]{2,5,7,12,44,6,9,1,11,13,40,77,3,6,8,2,9,32,76,1};

    //When
    double averageOfMyNumbers = ArrayOperations.getAverage(myNumbers);

    //Then
    assertTrue(18.2==averageOfMyNumbers);
}
}