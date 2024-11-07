package Worksheet9.src;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, String color){
        this.radius = radius;
        super(0, color);
    }
    public int getRadius(){
        return radius;
    }
    @Override
    public double getArea(){
        return Math.PI * (radius * radius);
    }
    @Override
    public String toString(){
        return "Radius: " + radius + "Color: " + this.getColor();
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    
}
