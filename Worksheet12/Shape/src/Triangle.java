package Worksheet12.Shape.src;

public class Triangle extends Shape {
    private int base;
    private int height;
    public Triangle(int base, int height, String color){
        super(3, color);
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return (base * height) / 2;
    }
}
