public class RPA1 {
    /*
     * Which types can be converted to a double WITHOUT explicit casting. For example:
     * double my_value = variable1;
     * assuming variable1 has a value and is one of the selected types. 
     * 
     * Byte, Int, Character, Long, Float, Short
    */

    /*
     * What contains the recipe for an object? - class
     * What is a keyword used to reference the current instance of an object? - this
     * What is a variable that exist with each instance of an object? - instance variable
     * What can only contain numeric style values? - primitive
     * What is a block of executable code in a class? - method
     * What do you call variables declared in the method signature? - parameters
     * What contains data and actions/methods relative to that? data. - object
     */

     /*
      * Match the numeric data type with the correct number of bits.
      * 
      * byte - 8
      * short - 16
      * int - 32
      * long - 64
      */

    public static int doItx2(int val) {
        return 2*val;
     }
     
     public static void doIt(int val){
        System.out.print(val);
     }
     public static void main(String[] args) {
           doIt(doItx2(4));
           doIt(3);
           System.out.print(doItx2(4));

           /*        */

           int length = 10; // LABEL 4 - Local method variables
           int width = 100;
           Rectangle smallBuildingOnCampus = new Rectangle(); // LABEL 5 - Constructs object
           smallBuildingOnCampus.setLength(length);
           smallBuildingOnCampus.setWidth(width);
           System.out.println(smallBuildingOnCampus.getArea());
     }


    
}
