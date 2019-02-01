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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.getA(), getA()) == 0 &&
                Double.compare(square.getB(), getB()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
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
