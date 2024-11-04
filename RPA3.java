import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RPA3 {
    public static void doSomething(String str) {
        System.out.println(str);
    }

    /*
     * Given the following program, what is printed?
     * Hello CS 1
     * I hope you are enjoying, yourself!
     */
    public static void main(String[] args) {
        try {
            Scanner fileHandler = new Scanner(new File("file.txt"));
            while (fileHandler.hasNext()) {
                doSomething(fileHandler.nextLine());
            }
        } catch (IOException io) {
            // what happens if the file is not there??
        }

        System.out.println("TESTING: " + sub3("Kakwit"));
        System.out.println("TESTING: " + sub2("frankie@rhps.com"));
        System.out.println("TESTING: " + sub("Brad,Magenta,Columbia"));
        System.out.println("TESTING: " + sub("Magenta,Brad,,Columbia"));

        // PrintWriter writer = new PrintWriter(new File("output.txt"));
        // writer.print("This");
        // writer.print("is");
        // writer.print("a");
        // writer.print("single");
        // writer.print("line");
        // writer.close();
        /*
         * ERROR
         */
    }

    /*
     * Mark the following resources that a Scanner can read.
     * String
     * IOStream
     * System.in
     * File
     * File input stream
     */

    /*
     * Which line of code creates a PrintWriter to write a file named "output.txt"?
     * PrintWriter out = new PrintWriter (new File("output.txt"));
     */

    /*
     * Categorize the following Exceptions into their correct groups
     *      Checked
     *          FileNotFoundException
     *          IOException
     *      Unchecked
     *          ArrayIndexOutOfBoundsException
     *          NullPointerException
     *          NumberFormatException
     */

    /*
     * Which line of code creates a Scanner to read a file named "input.txt"?
     * Scanner in = new Scanner (new File("input.txt"));
     */

    /*
     * If an exception is a Checked Exception, how can the programmer handle it?  (Multiple answers may apply)
     *      The exception may be thrown to the calling method
     *      The exception may be handled in a try/catch block.
     */

     /*
      * Given the following code, mark the exceptions that will be raised. 
      * The toys.txt file exists in the same directory in which the program is being run, and the program is being run in the following directory
      * /usr/local/
      * toys.txt contains:
      * Waterskies
      * Rackets
      * Action Figures

      * 
      */

    public static String sub(String str) {

        System.out.println("Test:" + str.indexOf(",", str.indexOf(",")));
        System.out.println("Test:" + str.indexOf(",", str.indexOf(",") + 1));
        return str.substring(str.indexOf(",") + 1, str.indexOf(",", str.indexOf(",") + 1));


    }

    public static String sub2(String str) {

        return str.substring(str.indexOf("@"));

    }

    public static String sub3(String str) {

        String rtn = "";

        String key = "KitHawk";

        String key2 = "abcdefgh";

        rtn += key2.charAt(key.indexOf(str.charAt(0)));

        rtn += key2.charAt(key.indexOf(str.charAt(1)));

        rtn += key2.charAt(key.indexOf(str.charAt(2)));

        return rtn;

    }

}
