package com.kodilla.testing.shape;

import java.util.Objects;

import static java.lang.Math.*;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
    

    public String getShapeName(){
        return "Circle";
    }

    @Override
    public Double getField(double a,double b,double c,double h,double r) {
        return PI * r *r ;
    }
}
