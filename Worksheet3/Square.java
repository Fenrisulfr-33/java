package Worksheet3;
/*
a. Does it store any value/instance variable?
    yes is stores the this.side value instance.
b. What does the method getSide do?
    getSide will return the instance of the side.
c. What does the method setSide do?
    setSide will set the instance of the side, it uses this.side to differentiate from the instance to the argument
d. What does the method calculateArea do?
    calculateArea will return the instance of side*side to give you the area.
e. What does the method toString do?
    toString will return the string Side: with the value of the instance of side.
*/

public class Square {
    private int side;

    public Square() {
        setSide(0);
    }

    public Square(int side) {
        setSide(side);
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int calculateArea() {
        return side * side;
    }

    public String toString() {        
        return "Side: " + side;
    }
}