package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double c;
    private double h;

    public Triangle(double c, double h) {
        this.c = c;
        this.h = h;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }

    public String getShapeName(){
        return "Triangle";
    }

    @Override
    public Double getField(double a, double b, double c, double h, double r) {
        return (c*h)/2;
    }
}
