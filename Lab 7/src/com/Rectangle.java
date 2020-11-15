package com;

public class Rectangle extends Figure{
    double len, wid;

    Rectangle(double l, double w){
        this.len = l;
        this.wid = w;
    }

    @Override
    double getArea() {
        return this.len * this.wid;
    }

    @Override
    double getPerimeter() {
        return (this.len + this.wid) * 2;
    }
}
