package com;

public class Cube implements GeometricBody{
    private double a;

    Cube(double a){
        this.a = a;
    }

    @Override
    public double getSurface() {
        return a*a*6;
    }

    @Override
    public double getVolume() {
        return a*a*a;
    }
}
