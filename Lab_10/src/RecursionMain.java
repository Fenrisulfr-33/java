package Lab_10.src;
import java.util.Scanner;

public class RecursionMain {
    
    public static void methodToCall(int choice, Scanner scnr) {
        RecursionHelper rHelp = new RecursionHelper();
        while(true) {
            switch (choice) {
                case 0: System.out.println("Now exiting.");
                        scnr.close();
                        System.exit(1);
                case 1: System.out.println("Enter the String you would like to reverse:");
                        String toReverse = scnr.next();
                        String reversed = rHelp.reverseString(toReverse);
                        System.out.println("Your reversed String: \n" + reversed);
                        break;
                case 2: System.out.println("Enter number you would like to get the power of: ");
                        int input = scnr.nextInt();
                        System.out.println("Now what would you like that to the power of?: ");
                        int input2 = scnr.nextInt();
                        int output = rHelp.pow(input, input2);
                        System.out.println(String.format("%d is %d to the power of %d.", output, input, input2));
                        break;
                case 3: System.out.println("Enter word to check for palindromes: ");
                        String toCheck = scnr.next();
                        boolean palindrome = rHelp.palindromeChecker(toCheck);
                        if(palindrome) System.out.println("Palindrome found!");
                        else System.out.println("No palindrome found.");
                        break;
                default:System.out.println("Input not recognized.");
            }
            printChoices();
            choice = scnr.nextInt();
        }
    }
    
    public static void printChoices() {
        System.out.println("What method would you like to call?");
        System.out.println("1. reverseString()");
        System.out.println("2. pow()");
        System.out.println("3. palindromeChecker()");
        System.out.println("Please type 1, 2, or 3.");
        System.out.println("Or type 0 to exit.");
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Welcome to your recursion program!");
        printChoices();

        methodToCall(scnr.nextInt(), scnr);
    }
}
