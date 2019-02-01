package com.kodilla.testing.collection;

import org.junit.*;

import java.lang.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {


    @Before
    public void before(){
        System.out.println("Przypadek testowy: początek");
    }

    @After
    public void after(){
        System.out.println("Przypadek testowy: Koniec");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Zbiór testów: początek");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Zbiór testów: koniec");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //testOddNumbersExterminatorEmptyList

        //Given
        ArrayList<Integer> numbers = new ArrayList<>();

        //When
        OddNumbersExterminator oddNumbersExterminator2= new OddNumbersExterminator();
         ArrayList<Integer> evenNumbersFirst = oddNumbersExterminator2.exterminate(numbers);
        System.out.println("Testing: evenNumbersEmpty");

        //Then
        Assert.assertTrue(evenNumbersFirst.size()==0);
        }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        //testOddNumbersExterminatorNormalList

        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);



        //When
        OddNumbersExterminator oddNumbersExterminator3= new OddNumbersExterminator();
        ArrayList <Integer>evenNumbersSecond = oddNumbersExterminator3.exterminate(numbers);
        System.out.println("Testing: evenNumbersNormal");

        //Then
        Assert.assertTrue(evenNumbersSecond.contains(2));
        Assert.assertTrue(evenNumbersSecond.contains(4));
        Assert.assertTrue(evenNumbersSecond.contains(6));
        Assert.assertTrue(evenNumbersSecond.contains(8));
        Assert.assertTrue(evenNumbersSecond.contains(10));
        Assert.assertTrue(evenNumbersSecond.contains(12));

    }


}
