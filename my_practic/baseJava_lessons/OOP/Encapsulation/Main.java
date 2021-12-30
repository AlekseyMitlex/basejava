package baseJava_lessons.OOP.Encapsulation;

import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(5, 10);
        Triangle t = new Triangle(10, 10, 10);
        System.out.println("Square of the rectangle is " + r.area());
        System.out.println("Square of the triangle is " + t.area());
    }
}

abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private final double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }
}

class Triangle extends Shape {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double halfPerimeter = (this.a + this.b + this.c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.a) * (halfPerimeter - this.b) * (halfPerimeter - this.c));
    }
}
