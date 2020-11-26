package com;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.2, 2);
        Square square = new Square(2.4);
        Triangle triangle = new Triangle(4, 1.4, 5);
        Figure[] arr = new Figure[4];

        arr[0] = rectangle;
        arr[1] = square;
        arr[2] = triangle;

        FigureController figureController = new FigureController();
        System.out.println(figureController.biggestArea(arr).getClass().getSimpleName());
        System.out.println(figureController.biggestPerimeter(arr).getClass().getSimpleName());

        Square circle = new Square(10){
            double getArea() {
                return 3.1416 * this.side * this.side;
            }

            double getPerimeter() {
                return 2 * 3.1416 * this.side;
            }
        };

        arr[3] = circle;
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(figureController.biggestArea(arr).getArea());
        System.out.println(figureController.biggestPerimeter(arr).getPerimeter());
    }
}
