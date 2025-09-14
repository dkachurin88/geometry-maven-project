package com.example;

public class App {
    public static void main(String[] args) {
        // Создаем геометрические фигуры
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        
        // Используем утилиты из GeometryUtils
        System.out.println("=== GEOMETRIC SHAPES WITH UTILS ===");
        
        // Выводим информацию с помощью утилит
        GeometryHelper.printShapeInfo("Circle", circle.calculateArea(), circle.calculatePerimeter());
        GeometryHelper.printShapeInfo("Rectangle", rectangle.calculateArea(), rectangle.calculatePerimeter());
        GeometryHelper.printShapeInfo("Triangle", triangle.calculateArea(), triangle.calculatePerimeter());
        
        // Сравниваем площади
        System.out.println("Comparison: " + 
            GeometryHelper.compareAreas(circle.calculateArea(), rectangle.calculateArea()));
        
        // Конвертация единиц
        System.out.println("\nUnit conversion:");
        System.out.println("150 cm = " + GeometryHelper.centimetersToMeters(150) + " m");
        System.out.println("2.5 m = " + GeometryHelper.metersToCentimeters(2.5) + " cm");
    }
}