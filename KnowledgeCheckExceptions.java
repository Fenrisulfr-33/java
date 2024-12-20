import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class KnowledgeCheckExceptions {
    public String name;
    private int age;
    ArrayList<String> toys = new ArrayList<>();

    public void setAge(String toConvert) {
        try {
            age = Integer.parseInt(toConvert);
        }catch(NumberFormatException ex) {
            System.out.println("number format!");
        }
    }

    public void readCollection(String filename) {
        try {
            Scanner snr = new Scanner(new FileInputStream(filename));
            while(snr.hasNextLine()) {
                toys.add(snr.nextLine());
            }
        }catch(FileNotFoundException ex) {
            System.out.println("Not found");
        }
    }

    public String getToy(int location) {
        return toys.get(location);
    }

    public static void main(String[] args) {
        KnowledgeCheckExceptions carl = new KnowledgeCheckExceptions();
        carl.setAge("25");
        carl.readCollection("/toys.txt");
        carl.setAge(carl.getToy(carl.name.length()));
    }
        /*
      * Given the following code, mark the exceptions that will be raised. 
      * The toys.txt file exists in the same directory in which the program is being run, and the program is being run in the following directory
      * /usr/local/
      * toys.txt contains:
      * Waterskies
      * Rackets
      * Action Figures

      *     NullPointerException
      *     FileNotFoundException
      */
}