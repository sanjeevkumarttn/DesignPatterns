package com.DesignPatterns;

// Implementor
interface Color {
    String getColorType();
}

// Concrete Implementor
class Red implements Color {
    @Override
    public String getColorType() {
        return "Red";
    }
}

class Blue implements Color {

    @Override
    public String getColorType() {
        return "Blue";
    }
}

class Pink implements Color {

    @Override
    public String getColorType() {
        return "Pink";
    }
}

//Abstraction
class Shape {
    String type;
    Color color;

    Shape(String type, Color color) {
        this.type = type;
        this.color = color;
    }
}

//Refined Abstraction
class Square extends Shape {
    private int side;

    Square(Color color, int side) {
        super("Square", color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "type='" + type + '\'' +
                ", color=" + color.getColorType() +
                ", side=" + side +
                '}';
    }
}

class Triangle extends Shape {
    private int base;
    private int height;

    Triangle(Color color, int base, int height) {
        super("Triangle", color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "type='" + type + '\'' +
                ", color=" + color.getColorType() +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}

class Circle extends Shape {
    private int radius;

    Circle(Color color, int radius) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "type='" + type + '\'' +
                ", color=" + color.getColorType() +
                ", radius=" + radius +
                '}';
    }
}

public class Question5 {

    public static void main(String[] args) {

        Square blueSquare = new Square(new Blue(), 12);
        System.out.println(blueSquare);

        Square redSquare = new Square(new Red(), 10);
        System.out.println(redSquare);

        Triangle pinkTriangle = new Triangle(new Pink(), 10, 12);
        System.out.println(pinkTriangle);

        Circle redCircle = new Circle(new Red(), 7);
        System.out.println(redCircle);
    }
}
