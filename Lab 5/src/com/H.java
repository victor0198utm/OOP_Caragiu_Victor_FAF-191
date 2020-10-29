package com;

public class H extends G {
    public String h = "h";
    private X xObj = new X("xh");

    H(){}

    H(String h){
        this.h = h;
    }

    protected X getXObj(){
        return this.xObj;
    }
}
