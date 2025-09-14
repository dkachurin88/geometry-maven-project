package com.example;

public class GeometryHelper {
    
    public static double centimetersToMeters(double cm) {
        return cm / 100.0;
    }
    
    public static double metersToCentimeters(double m) {
        return m * 100.0;
    }
    
    public static String compareAreas(double area1, double area2) {
        if (area1 > area2) return "First larger";
        if (area1 < area2) return "Second larger";
        return "Equal area";
    }
    
    public static void printShapeInfo(String name, double area, double perimeter) {
        System.out.println(name + ": Area=" + area + ", Perimeter=" + perimeter);
    }
}