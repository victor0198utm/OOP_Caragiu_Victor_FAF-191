package com.monitor;

public class Monitor {
    String color;
    int width, height;
    int pixels_w, pixels_h;

    public static void main(String[] args) {
        // first monitor
        Monitor m1 = new Monitor();
        m1.color = "Grey";
        m1.width = 42;
        m1.height = 27;
        m1.pixels_w = 1920;
        m1.pixels_h = 1080;

        // second monitor
        Monitor m2 = new Monitor();
        m2.color = "Black";
        m2.width = 36;
        m2.height = 21;
        m2.pixels_w = 1366;
        m2.pixels_h = 720;
    }
}
