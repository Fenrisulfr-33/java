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

    public String toString() {
        return "Sides: " + sides + " Color: " + color;
    }

    public void ArrayShape(){

    }
}

/*
Write a class ArrayShape that manipulate an array of Shape type. You should be able to
create the array of Shape, include objects in the array and print all the elements that
you have in the array. Use the the ArrayInts class as a template for you to follow.

 */