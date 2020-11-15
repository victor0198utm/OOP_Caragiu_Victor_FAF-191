package com;

public class Triangle extends Figure{
    double a,b,c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double sp = getPerimeter() / 2;
        return sp * (sp - this.a) * (sp - this.b) * (sp - this.c);
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }
}
