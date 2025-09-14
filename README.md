# Geometry Maven Project

Multi-module Maven project for geometric calculations.

## Modules:
- GeometryLibrary - Basic geometric shapes (Circle, Rectangle, Triangle)
- GeometryUtils - Utilities for unit conversion and comparisons
- GeometryApp - Main application using both modules

## How to build:
Open command line in project folder and run:
mvn clean install

## How to run:
cd GeometryApp
mvn exec:java -Dexec.mainClass="com.example.App"

## Project structure:
my-geometry-project/
+-- pom.xml (parent POM)
+-- GeometryLibrary/
+-- GeometryUtils/
L-- GeometryApp/

Created as part of AQA training course.
