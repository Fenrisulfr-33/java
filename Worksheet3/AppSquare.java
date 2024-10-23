package Worksheet3;

import java.util.Scanner;
import java.util.ArrayList;

/*
a. Does it store any value?
    it stores the side in the sq1 instance.
b. What the main method is doing?
    the main method is asking you for the side of the square then showing you the side value calculating the area
    then showing you the area and asking you if you want to go again or else it ends. It uses a while loop while your
    response is not n.
c. Where the setSide method from Square is being called? Why is this called like that?
    the setSide method is being called from the square class, its called like that bc sq1 is and instance of the square class
    so it has access to those class functions.
d. Where the getSide method from Square is being called? Why is this called like that?
    Same thing as above, it uses the square class methods available in the square instance.
 */

public class AppSquare {
    public static void main(String args[]) {
        Square sq1 = new Square();
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to run the program (y/n)");
        char answer = in.nextLine().charAt(0);
        while (answer != 'n') {
            System.out.println("Enter a side:");
            int side = in.nextInt();
            System.out.println("Current side of the square: " + sq1.getSide());
            System.out.println("Changing the side of the Square:");
            sq1.setSide(side);
            System.out.println("New side of the square: " + sq1.getSide());
            int area = sq1.calculateArea();
            System.out.println("Area : " + area + " " + sq1.toString());
            System.out.println("Do you want to run the program (y/n)");
            in.nextLine();
            answer = in.nextLine().charAt(0);
        }
        in.close();




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

