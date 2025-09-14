package com.example;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        
        Cube cube = new Cube(3.0);
        Sphere sphere = new Sphere(2.0);
        
        System.out.println("=== GEOMETRIC SHAPES ===");
        
        GeometryHelper.printShapeInfo("Circle", circle.calculateArea(), circle.calculatePerimeter());
        GeometryHelper.printShapeInfo("Rectangle", rectangle.calculateArea(), rectangle.calculatePerimeter());
        GeometryHelper.printShapeInfo("Triangle", triangle.calculateArea(), triangle.calculatePerimeter());
        
        System.out.println("=== 3D SHAPES ===");
        System.out.println("Cube - Volume: " + cube.calculateVolume() + ", Surface Area: " + cube.calculateSurfaceArea());
        System.out.println("Sphere - Volume: " + sphere.calculateVolume() + ", Surface Area: " + sphere.calculateSurfaceArea());
        
        System.out.println("Comparison: " + 
            GeometryHelper.compareAreas(circle.calculateArea(), rectangle.calculateArea()));
    }
}