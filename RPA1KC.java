public class RPA1KC {

    private double myValue = 0;

    public void setValue(double myValue) {
        this.myValue = myValue;
    }

    public double getValue() {
        return myValue;
    }

    /*
     * Variable	Value
    x	10
    y	5.0
    one	@KC.one
    two	@KC.two
 
    @KC.one

    variable	value
    myValue	10.0

    @KC.two

    variable	value
    myValue	5.0
     */
    public static void main(String[] args) {
        String name;
        name = "James Gosling";

        System.out.print("Name: " + name);
    }

}
