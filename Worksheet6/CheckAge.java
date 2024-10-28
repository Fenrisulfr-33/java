package Worksheet6;

import java.io.*;
// This will shows a specific error message if the age is 18 or under
public class CheckAge {
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(20); // Set age to 15 (which is below 18...)
    }
}