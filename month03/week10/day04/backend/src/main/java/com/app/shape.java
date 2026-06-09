package com.app;

abstract class Shape {

    abstract double area();
    abstract double perimeter();

    boolean isLargerThan(Shape other) {
        return this.area() > other.area();
    }

    String describe() {
        return String.format("%s: area=%.2f, perimeter=%.2f",
                getClass().getSimpleName(), area(), perimeter());
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }

     double area()      { return Math.PI * radius * radius; }
     double perimeter() { return 2 * Math.PI * radius; }
}

class Square extends Shape {
    double side;
    Square(double side) { this.side = side; }

     double area()      { return side * side; }
     double perimeter() { return 4 * side; }
}

class Rectangle extends Shape {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area()      { return width * height; }
    double perimeter() { return 2 * (width + height); }
}


