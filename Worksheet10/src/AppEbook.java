package Worksheet10.src;
import java.util.ArrayList;

public class AppEbook {
    ArrayList<String> bookPages = new ArrayList<String>();

    bookPages.add("First");
    bookPages.add("Second page");
    Ebook newBook = new Ebook("My Book", bookPages);
    System.out.println(newBook.read());
}
