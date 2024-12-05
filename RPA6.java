
/**
 * bubble sort O(n^2)
 * linear search (O(n)
 * binary search O (log n)
 * selection sort O (n log n)
 */

public class RPA6 {
    public static void swapper(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public static void swapperReverse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j > i; j--) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        print(matrix);
    }

    public static int[][] swapperReturn(int[][] matrix) {
        int[][] newMatrix = matrix;
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                int tmp = newMatrix[i][j];
                newMatrix[i][j] = newMatrix[j][i];
                newMatrix[j][i] = tmp;
            }
        }
        return newMatrix;
    }

    public static int[][] swapperReturn2(int[][] matrix) {
        int[][] newMatrix = matrix;
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = matrix[i].length - 1; j > i; j--) {
                int tmp = newMatrix[i][j];
                newMatrix[i][j] = newMatrix[j][i];
                newMatrix[j][i] = tmp;
            }
        }
        return newMatrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Row: " + i + " Col: " + j + " = " + matrix[i][j]);
            }
        }
    }

    public static int[] x(int[][] matrix, int[] row) {
        int[] answer = new int[row.length];
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j] % row[j];
            }
            answer[i] = total;
        }
        return answer;
    }

    public static int collect(Object[] array, int pos) {
        if (pos >= array.length)
            return 0;
        if (array[pos] instanceof Integer[])
            return collect((Integer[]) array[pos], 0) +
                    collect(array, ++pos);
        return (Integer) array[pos] + collect(array, ++pos);
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 20, 21, 22 }, { 30, 31, 32 } };
        swapper(matrix);
        // System.out.println("------");
        // swapperReverse(matrix);

        // int[][] result = swapperReturn2(matrix);
        // print(result);

        // int[][] matrix2 = { { 1, 2, 3 }, { 2, 2, 2 }, { 3, 3, 3 } };
        // System.out.println(3%1);
        // System.out.println(Arrays.toString(x(matrix2, new int[] { 1, 2, 1 })));
        // System.out.println(Arrays.toString(x(matrix2, new int[] { 2, 2, 2 })));
        // System.out.println(Arrays.toString(x(matrix2, new int[] { 2, 2, 1 })));
        // System.out.println(1 % 2);

        // System.out.println(collect(new Object[] { 1, new Integer[] { 1, 10 }, 3 }, 0)); // line 1
        // System.out.println(collect(new Integer[] { 10, 10, 10 }, 0)); // line2

    }
}
