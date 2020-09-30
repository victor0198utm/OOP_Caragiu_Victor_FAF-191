package com;

import java.awt.geom.Area;

public class Box {
    public float width, height, depth;
    public Box(){
        this.height = this.width = this.depth = 1;
    }

    public Box(float dimension){
        this.height = this.width = this.depth = dimension;
    }

    public Box(float w, float h, float d){
        this.height = h;
        this.width = w;
        this.depth = d;
    }

    public float Area(){
        return (this.width * this.height + this.height * this.depth +
                this.width * this.depth) * 2;
    }

    public float Volume(){
        return this.depth * this.width * this.height;
    }

    public static void main(String[] args) {
        Box defaultBoxObj = new Box();
        Box cubeBoxObj = new Box(5);
        Box boxObj = new Box(1,2,3);

        System.out.println(defaultBoxObj.Area());
        System.out.println(cubeBoxObj.Area());
        System.out.println(boxObj.Area());

        System.out.println(defaultBoxObj.Volume());
        System.out.println(cubeBoxObj.Volume());
        System.out.println(boxObj.Volume());


    }
}
