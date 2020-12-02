package com;

public class Parallelepiped implements GeometricBody{
    private double a,b,h;

    Parallelepiped(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getSurface() {
        return (a+b)*2*h + 2*a*b;
    }

    @Override
    public double getVolume() {
        return a*b*h;
    }
}
