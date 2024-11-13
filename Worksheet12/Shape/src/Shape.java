package Worksheet12.Shape.src;
public abstract class Shape implements Colorable {
    protected int sides;
    private String color;
    public Shape(int sides, String color) {
        this.sides = sides;
        setColor(color);
    }
    public abstract double getArea();
    public String getColor() { return color;}
    public int getSides() {return sides;} // added from the UML
    public void setColor(String color) {this.color = color;}
    public int getRed() {return Integer.parseInt(color.substring(0, color.indexOf(",")));}
    public int getGreen() {return Integer.parseInt(color.substring(color.indexOf(",")+1,
            color.lastIndexOf(",")));}
    public int getBlue() { return Integer.parseInt(color.substring(color.lastIndexOf(",")+1)); }
    public String toString() {
        return String.format("Sides: %d, Area: %.2f", sides, getArea());
    }
}