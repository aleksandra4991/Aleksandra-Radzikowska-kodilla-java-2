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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getR(), getR()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getR());
    }

    public String getShapeName(){
        return "Circle";
    }

    @Override
    public Double getField(double a,double b,double c,double h,double r) {
        return PI * r *r ;
    }
}
