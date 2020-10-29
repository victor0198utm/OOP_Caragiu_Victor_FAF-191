package com;

public class A {
    protected String a = "a";
    X xObj = new X("xxx");

    A(){}

    A(String a, X x){
        this.a = a;
        this.xObj = x;
    }
}
