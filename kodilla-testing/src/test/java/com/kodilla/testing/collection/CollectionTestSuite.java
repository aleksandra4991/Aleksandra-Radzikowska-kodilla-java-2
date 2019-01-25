package com.kodilla.testing.collection;

import org.junit.*;

import java.lang.*;

import java.util.ArrayList;

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
        ArrayList<Integer> evenNumbersEmpty = new ArrayList<Integer>();

        //When
        OddNumbersExterminator oddNumbersExterminator2= new OddNumbersExterminator();
         ArrayList<Integer> evenNumbersFirst = oddNumbersExterminator2.exterminate(oddNumbersExterminator2.getNumbers());
        System.out.println("Testing: evenNumbersEmpty");

        //Then
        Assert.assertEquals(evenNumbersEmpty,evenNumbersFirst);
        }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        //testOddNumbersExterminatorNormalList

        //Given
        ArrayList<Integer> evenNumbersNormal = new ArrayList<Integer>();
        evenNumbersNormal.add(2);
        evenNumbersNormal.add(4);
        evenNumbersNormal.add(6);
        evenNumbersNormal.add(8);


        //When
        OddNumbersExterminator oddNumbersExterminator3= new OddNumbersExterminator();
        ArrayList <Integer>evenNumbersSecond = oddNumbersExterminator3.exterminate(oddNumbersExterminator3.getNumbers());
        System.out.println("Testing: evenNumbersNormal");

        //Then
        Assert.assertEquals(evenNumbersNormal,evenNumbersSecond);
    }


}
