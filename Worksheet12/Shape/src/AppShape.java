package Worksheet12.Shape.src;
import java.util.Arrays;

public class AppShape {
    public static void main(String args[]){
        Shape[] shapes = new Shape[3]; // fixed size
        Circle crcl = new Circle(10, "234,255,123");
        System.out.println("The color is " + crcl.getColor());
        shapes[0] = crcl;
        shapes[1] = new Rectangle(23, 5, "123,125,255");

        System.out.println(Arrays.toString(shapes));
    }
}
