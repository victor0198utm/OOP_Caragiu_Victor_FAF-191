package com;

public class FigureController {
    public Figure biggestArea(Figure[] f){
        int idx=0;
        for (int i=1; !(i>=f.length || f[i]==null);i++){
            idx = f[i-1].getArea()<f[i].getArea()? i : i-1;
        }
        return f[idx];
    }

    public Figure biggestPerimeter(Figure[] f){
        int idx=0;
        for (int i=1; !(i>=f.length || f[i]==null);i++){
            idx = f[i-1].getPerimeter()<f[i].getPerimeter()? i : i-1;
        }
        return f[idx];
    }
}
