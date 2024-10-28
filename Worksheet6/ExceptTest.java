package Worksheet6;
import java.io.*;

// To fix this the array must be 4 total elements
// If not it throws and error
public class ExceptTest {
    public static void main(String args[]) {
        try {
            int a[] = new int[4];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally {
            System.out.println("Out of the block");
        }
    }
}