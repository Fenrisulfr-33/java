package Worksheet9.src;

public class Square extends Rectangle {
    private int size;

    public Square(int size, String color){
        this.size = size;
        super(size, size, color);
    }
    public int getSize(){
        return size;
    }
    @Override
    public double getArea(){
        return size * size;
    }
    @Override
    public String toString(){
        return "Height: " + size + " Width: " + size + " Color: " + this.getColor();
    }

}
