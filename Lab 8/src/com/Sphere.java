package com;

public class Sphere implements GeometricBody{
    private double r;

    Sphere(double r){
        this.r = r;
    }

    @Override
    public double getSurface() {
        return 4.0*3.1416*r*r;
    }

    @Override
    public double getVolume() {
        return (4.0/3.0)*3.1416*r*r*r;
    }
}
