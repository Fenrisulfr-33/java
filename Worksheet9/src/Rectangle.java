package Worksheet9.src;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color){
        this.width = width;
        this.height = height;
        super(4, color);
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    @Override
    public double getArea(){
        return width * height;
    }
    @Override
    public String toString(){
        return "Height: " + height + " Width: " + width + " Color: " + this.getColor();
    }

}
