package Worksheet9.src;

import java.util.ArrayList;

public class Shape {
    protected int sides;
    private String color;

    public Shape(int sides, String color) {
        this.sides = sides;
        this.color = color;
    }

    public int getSides() {
        return sides;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0.0;
    }

    public String toString() {
        return "Sides: " + sides + " Color: " + color;
    }

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Shape s1 = new Shape(0, "Blue");
        Shape s2 = new Rectangle(2, 1, "Green");
        Shape s3 = new Circle(2, "Red");
        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);

        for (Shape s : shapes) {
            // System.out.println(s);
            if (s instanceof Shape) {
                System.out.println(s);
            }
            if (s instanceof Rectangle) {
                System.out.println(s);
            }
            if (s instanceof Circle) {
                System.out.println(s);
            }
        }
    }
}
