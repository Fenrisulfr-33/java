package Worksheet3;

import java.util.ArrayList;

/*
Create an AppSquareArrayList that creates an ArrayList of Squares.
a. Add 3 different squares
b. Do a for loop to iterate over the ArrayList and print the side and area of each Square
object.
c. Remove the first element in the ArrayList.
d. Print the new size of the ArrayList.
e. Change the side of the last square to 200.
f. Do a for loop to iterate over the ArrayList and print the side of each Square object.
*/

public class AppSquareArrayList {
    ArrayList<Square> squareList = new ArrayList<>();
    squareList.add(new Square(2));
    squareList.add(new Square(4));
    squareList.add(new Square(8));

    for(int i = 0; i < squareList.size(); i++){
        System.out.println("Side: " + squareList.get(i).getSide());
        System.out.println("Area: " + squareList.get(i).calculateArea());
    }

    squareList.remove(0);

    System.out.println(squareList.size());

    squareList.set(1, 200);

    for(int i = 0; i < squareList.size(); i++){
        System.out.println("Side:" + squareList.get(i).getSide());
    }
}
