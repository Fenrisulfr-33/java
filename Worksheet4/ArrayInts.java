import java.util.Arrays;
import java.util.Scanner;

public class ArrayInts {
    private Scanner in; // declaring instance variable
    private int[] array; // declaring instance variable

    public ArrayInts(int length) { // constructor
        in = new Scanner(System.in); // this constructs the object
        array = new int[length]; // this constructs the array
    }

    public void readArray() { // does not return
        for (int i = 0; i < array.length; i++) { // loop through the array length
            System.out.println("Enter and integer number: "); // ask for int
            int value = in.nextInt(); // assign next int as value
            array[i] = value; // assign value to index
        }
    }

    public String toString() {
        return Arrays.toString(array); // returns string for of the typed ints
    }

    public void invert(){
        for(int beg = 0, en = array.length-1; beg < array.length/2; beg++, en--){
            int temp = array[beg];
            array[beg] = array[en];
            array[en] = temp;
        }
    }

    public int maximum(){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}

/*
a. Does it store any value? If yes, what are their types? Are they instance or class variables?
    Yes it stores values in the array of int type, it is a instance variable.
b. Explain what each method does.
    arrayInts constructs the scanner and array variable.
    readArray asks the user to enter ints and saves them to the array.
    toString returns the ints in string form

3.Write a method that invert the elements in the array. What class should you implement this method?
4. Write a method that returns a String containing the maximum value in the array and its
position. What class should you implement this method?
5. Call the methods you wrote in the AppArrayInts class.

 */