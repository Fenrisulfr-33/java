import java.util.Scanner;

public class Worksheet2 {
    public static boolean compareStrings(String str1, String str2) {
        // use the method equals to compare and return the result of the
        // comparison between str1 and str2
        return str1.equals(str2);
    }

    public static String alphaOrder(String str1, String str2) {
        // return the message "str1 comes before str2 in the alphabet", or
        // "str1 comes after str2" in the alphabet, or "str1 is equal str2"
        // depending on the return of the compareTo method
        // remember to return the value of str1 and str2 in each one of those
        // messages, not the String "str1" and/or "str2"
        int compare = str1.compareTo(str2);

        if (compare < 0) {
            return str1 + " comes before " + str2 + " in the alphabet";
        } else if (compare > 0) {
            return str1 + " comes after " + str2 + " in the alphabet";
        } else {
            return str1 + " is equal " + str2;
        }
    }

    public static int countChar(String str, char c) {
        // count the number of times that char c appears in string str
        // you will need to use a for loop to go through the String str
        // use the length() and charAt(index) methods. If you don't remember
        // how they work, do a search on the Internet.
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        // Create a Scanner object to read from the console/terminal
        Scanner scanner = new Scanner(System.in);
        // read the variables you need in order to do the correct call of
        // all the methods you implemented
        System.out.println("Enter str1");
        String str1 = scanner.nextLine();  // Read user input
        System.out.println("Enter str2");
        String str2 = scanner.nextLine();  // Read user input
        System.out.println("Enter char1");
        String str3 = scanner.nextLine();  // Read user input
        char char1 = str3.charAt(0);

        scanner.close();

        boolean result1 = compareStrings(str1, str2);
        String result2 = alphaOrder(str1, str2);
        int result3 = countChar(str2, char1);
        // print the returns of each method with an adequate message
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
