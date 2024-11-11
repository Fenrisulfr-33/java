package Worksheet9.src;

public class Triangle extends Shape {
    private int height;
    private int base;

    public Triangle(int base, int height, String color){
        this.base = base;
        this.height = height;
        super(3, color);
    }
    public int getBase(){
        return base;
    }
    public int getHeight(){
        return height;
    }
    // TODO: Fix this formula
    @Override
    public double getArea(){
        return base * height;
    }
    @Override
    public String toString(){
        return "Height: " + height + " Base: " + base + " Color: " + this.getColor();
    }
}
