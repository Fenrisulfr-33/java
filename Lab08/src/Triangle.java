//This is the class that you will be finishing. You need to implement the area(), perimeter(), and toString()

public class Triangle extends Shape {
    double length;
    double width;
    double third;
    public Triangle(double length, double width, double third){
        this.length = length;
        this.width = width;
        this.third = third;
    }

    public double area(){
        return (length * width) /2;
    }

    public double perimeter(){
        return length + width + third;
    }

    public String toString(){
        return String.format("This Triangle has a perimeter of %.2f and an area of %.2f", perimeter(), area());
    }
}
