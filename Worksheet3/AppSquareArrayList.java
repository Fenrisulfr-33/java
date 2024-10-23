package Worksheet3;

import java.util.ArrayList;
// import java.util.Arrays;

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
    public static void main(String[] args) {
        ArrayList<Square> list1 = new ArrayList<>();
        Square one = new Square(2);
        Square two = new Square(4);
        Square three = new Square(8);
        
        list1.add(one);
        list1.add(two);
        list1.add(three);
    
        for(Square temp : list1){
            System.out.println(temp.getSide());
            System.out.println(temp.calculateArea());
        }
        
        list1.remove(0);
        System.out.println(list1.size());
        // Square four = new Square(200);
        list1.set((list1.size()-1), new Square(200));
    
        for(Square temp2 : list1){
            System.out.println(temp2.getSide());
        }
    }

}
