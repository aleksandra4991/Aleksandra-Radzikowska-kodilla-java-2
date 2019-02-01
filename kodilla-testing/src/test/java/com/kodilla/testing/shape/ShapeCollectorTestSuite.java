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
        Triangle triangle=new Triangle(8,5);
        ShapeCollector shapeCollector1 = new ShapeCollector(triangle);

        //When
        shapeCollector1.addShape(triangle);

        //Then
        Assert.assertEquals(1,shapeCollector1.getShapesQuantity());
    }


    @Test
    public void testGetShape(){

    //Given
        Triangle triangle = new Triangle(8,5);
        ShapeCollector shapeCollector1 = new ShapeCollector(triangle);
        shapeCollector1.addShape(triangle);

     //When
        Shape retrievedShape;
         retrievedShape = shapeCollector1.getShape(0);

     //Then
       Assert.assertEquals(triangle,retrievedShape);

    }

    @Test
    public void testRemoveNonExistingShape(){

        //Given
        Circle circle1=new Circle(4);
        ShapeCollector shapeCollector1 = new ShapeCollector(circle1);

        //When
        boolean result = shapeCollector1.removeShape(circle1);

        //Then
        Assert.assertEquals(circle1,result);
    }

    @Test

    public void testRemoveShape(){

        //Given
        Circle circle1=new Circle(4);
        ShapeCollector shapeCollector1 = new ShapeCollector(circle1);
        shapeCollector1.removeShape(circle1);

        //When
        boolean result = shapeCollector1.removeShape(circle1);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector1.getShapesQuantity());
    }

    @Test

    public void testShowFiigures(){

        //Given
        Triangle triangle1= new Triangle(9.0,61.2);
        ShapeCollector shapeCollector2= new ShapeCollector(triangle1);
        shapeCollector2.addShape(triangle1);

        //When
        ArrayList<Shape>retrievedShapes=new ArrayList<Shape>();
        retrievedShapes = shapeCollector2.showFigures(retrievedShapes);

        //Then
        Assert.assertEquals(triangle1,retrievedShapes);
    }


}
