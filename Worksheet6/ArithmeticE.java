package Worksheet6;

// This function results in an error as you cannot divide by zero
public class ArithmeticE {
    public static void main(String args[]) {
        int a = 30, b = 0;
        int c = a / b;
        System.out.println("Result = " + c);
    }
}