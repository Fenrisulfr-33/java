public class AppsArrayInt {
    // if i don't have privates i don't have instance variables
    public static void main(String args[]) {
        ArrayInts obj = new ArrayInts(8);
        obj.readArray();
        System.out.println(obj);
        obj.invert();
        System.out.println(obj);
        System.out.println("Maximum value: " + obj.maximum());
    }
}

/*
a. Does it store any value? If yes, what are their types? Are they instance or class variables?
    The main stores local variables
b. Explain what each method does.
    the main method defines a new instance of ArrayInts, reads it and prints it.
 */