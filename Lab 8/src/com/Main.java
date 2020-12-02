package com;

public class Main {
    public static void main(String[] args) {
        GeometricBody[] arr = new GeometricBody[3];

        Cube cube = new Cube(3.3);
        arr[0] = cube;

        Sphere sphere = new Sphere(1.2);
        arr[1] = sphere;

        Parallelepiped parallelepiped = new Parallelepiped(2,3,1);
        arr[2] = parallelepiped;

        GeometricBodyController gbc = new GeometricBodyController();
        System.out.println(gbc.getBiggestVolume(arr));
        System.out.println(gbc.getBiggestSurface(arr));
    }
}
