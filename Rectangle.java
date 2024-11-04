public class Rectangle {
    int width = 0;  // LABEL 1 - instance variable
    int length = 0;

    public void setLength(int length) { // LABEL 2 - Instance method
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return calcArea(width, length);
    }

    public static int calcArea(int width, int length) { // LABEL 3 - Static method
        return width*length;
    }
}
