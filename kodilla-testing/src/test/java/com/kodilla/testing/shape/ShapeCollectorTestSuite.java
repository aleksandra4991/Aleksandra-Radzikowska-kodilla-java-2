package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

//Test suite for classes of shape
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void BeforeAllTests(){
        System.out.println("This is the beginning of all tests.");
    }

    @ AfterClass
    public static void AfterAllTests(){
        System.out.println("This is the end of all tests.");
    }

    @Before
    public void BeforeTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void AfterTest(){
        System.out.println("End of test #"+testCounter);
    }

    @Test
    public void testAddShape(){

        //Given
        Shape triangle=new Triangle(8, 5);
        ShapeCollector shapeCollector=new ShapeCollector();

        //When
        shapeCollector.addShape(triangle);

        //Then
        Assert.assertEquals(1,shapeCollector.getShapesQuantity());
    }


    @Test
    public void testGetShape(){

    //Given
        Shape circle = new Circle(4);
        ShapeCollector shapeCollector1 = new ShapeCollector();
        shapeCollector1.addShape(circle);

     //When
        Shape retrievedShape;
         retrievedShape = shapeCollector1.getShape(0);

     //Then
       Assert.assertEquals(circle,retrievedShape);

    }

    @Test
    public void testRemoveNonExistingShape(){

        //Given
        Shape circle1=new Circle(4);
        ShapeCollector shapeCollector1 = new ShapeCollector();

        //When
        boolean result = shapeCollector1.removeShape(circle1);

        //Then
        Assert.assertFalse(result);
    }

    @Test

    public void testRemoveShape(){

        //Given
        Shape circle1=new Circle(4);
        ShapeCollector shapeCollector1 = new ShapeCollector();
        shapeCollector1.addShape(circle1);

        //When
        boolean result = shapeCollector1.removeShape(circle1);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector1.getShapesQuantity());
    }

    @Test

    public void testShowFigures(){

        //Given
        Triangle triangle1= new Triangle(9.0,61.2);
        ArrayList<Shape>givenShapes=new ArrayList<Shape>();
        givenShapes.add(triangle1);

        //When
        ShapeCollector shapeCollector2=new ShapeCollector();
        shapeCollector2.showFigures(givenShapes);

        //Then
        Assert.assertTrue(givenShapes.contains(triangle1));
    }


}
