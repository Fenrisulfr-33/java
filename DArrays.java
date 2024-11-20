import java.util.Scanner;

public class DArrays {
    /**
     * main
     * Creates a Scanner object
     * Call the methods previously implemented
     * 
     * @param args
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = readMatrix(in, 3, 3);
        printMatrix(matrix);
        printMatrix(matrix);
        int[][] matrix2 = readMatrix2(in, 2);
        printMatrix(matrix2);
    }

    /**
     * readMatrix
     * Receives a Scanner in, int row and int col
     * Creates a matrix of row and col dimensions
     * Reads values for each element of the matrix and return the matrix
     * 
     * @param in
     * @param row
     * @param col
     * @return int [][]
     */
    public static int[][] readMatrix(Scanner in, int row, int col) {
        int[][] matrix = new int[row][col];
        // for to the row
        for (int i = 0; i < row; i++) {
            // for to the columns of the row we are in
            for (int j = 0; j < col; j++) {
                System.out.println("Enter an int number:");
                int num = in.nextInt();
                matrix[i][j] = num;
            }
        }
        return matrix;
    }

    /**
     * printMatrix
     * Print each element of the matrix using %-4d as formatting
     * pattern to print each element.
     * Tip: use System.out.printf
     * 
     * @param matrix
     */
    public static void printMatrix(int matrix[][]) {
        // number of rows - matrix.length
        for (int i = 0; i < matrix.length; i++) {
            // for to the columns of the row we are in
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            // we already print all columns
            System.out.println();
        }
    }

    /**
     * readMatrix2
     * Receives a Scanner in and an int row
     * Creates an irregular multidimensional array
     * Reads the number of columns for each row
     * Creates the array of columns for each row considering the
     * number read
     * Reads values for each element of the matrix and return the
     * 
     * @param in
     * @param row
     * @return int [][]
     */
    public static int[][] readMatrix2(Scanner in, int row) {
        int[][] matrix = new int[row][];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Enter the number of columns for " + i + " row:");
            int col = in.nextInt();
            matrix[i] = new int[col];
            // for to the columns of the row we are in
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter an int number: ");
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }

    /**
     * maxEachRow
     * Takes in a matrix
     * Creates a arr using the matrix length for each row
     * Goes through each row and defines a max
     * Replaces the max if value is higher
     * Adds max value to return arr
     * 
     * @param matrix
     * @return int []
     */
    public static int[] maxEachRow(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
            arr[i] = max;
        }
        return arr;
    }
    /**
     * maxMatrix
     * Takes in a matrix
     * gets an arr of the max values of each row
     * goes through arr and finds the max value
     * returns max value
     * 
     * @param matrix
     * @return int
     */
    public static int maxMatrix(int[][] matrix) {
        int[] arr = maxEachRow(matrix);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    /**
     * principalDiagonal
     * takes in an matrix
     * creates new arr using matrix row length
     * adds the value at increases row and column
     * returns the diagonal values going top left to bottom right
     * 
     * @param matrix
     * @return int []
     */
    public static int[] principalDiagonal(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arr[i] = matrix[i][i];
        }
        return arr;
    }
    /**
     * swapPrincipalSecondary
     * takes in a martix
     * 
     * @param matrix
     */
    public static void swapPrincipalSecondary(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int tmp = matrix[i][i];
            matrix[i][i] = matrix[i][matrix.length - 1 - i];
            matrix[i][matrix.length - 1 - i] = tmp;
        }
    }
}