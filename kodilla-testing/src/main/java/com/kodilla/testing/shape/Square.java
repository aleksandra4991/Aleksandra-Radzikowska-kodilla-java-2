package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    private double a;
    private double b;

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public Double getField(double a,double b,double c,double h,double r) {
        return a * b;
    }
}
