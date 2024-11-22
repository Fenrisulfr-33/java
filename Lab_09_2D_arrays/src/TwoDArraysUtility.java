package Lab_09_2D_arrays.src;

public class TwoDArraysUtility {

    /**
     * Student Self-Explanation
     * 
     * 
     * 
     * 
     */
    public boolean play(int player, int column, int[][] board) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][column - 1] == 0) {
                board[i][column - 1] = player;
                return true;
            }
        }
        return false;
    }

    /**
     * Student Self-Explanation
     * *
     * 
     * 
     * 
     */
    public int checkForWin(int[][] board) {
        // Check horizontal
        int checkH = checkHorizontal(board);
        if (checkH != 0) {
            // System.out.println("Win horizontal");
            return checkH;
        }
        // Check vertical
        int boardWidth = board[0].length;
        for (int col = 0; col < boardWidth; col++) {
            int checkV = checkVertical(board, col);
            if (checkV != 0) {
                // System.out.println("Win vertical");
                return checkV;
            }
        }
        // Check diagonal
        int checkD = checkDiagonal(board);
        if (checkD != 0){
            // System.out.println("Win diagonal");
            return checkD;
        }
        // Check other diagonal
        int checkRD = checkReverseDiagonal(board);
        if (checkRD != 0){
            // System.out.println("Win reverse diagonal");
            return checkRD;
        }
        return 0;
    }

    private int checkHorizontal(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            int player = 0;
            int win = 0;
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 1) {
                    if (player == 2){
                        win = 0;
                    }
                    player = 1;
                    win++;
                }
                if (board[row][col] == 2) {
                    if (player == 1){
                        win = 0;
                    }
                    player = 2;
                    win++;
                }
                if (win == 4) {
                    return player;
                }
            }
        }
        return 0;
    }

    private int checkVertical(int[][] board, int column) {
        int player = 0;
        int win = 0;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] == 1) {
                if (player == 2){
                    win = 0;
                }
                player = 1;
                win++;
            }
            if (board[row][column] == 2) {
                if (player == 1){
                    win = 0;
                }
                player = 2;
                win++;
            }
            if (win == 4) {
                return player;
            }
        }
        return 0;
    }

    private int checkDiagonal(int[][] board) {
        // 3 is the cut off column
        // 2 if the cutoff row
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if (board[row][col] == 1 &&
                        board[row + 1][col + 1] == 1 &&
                        board[row + 2][col + 2] == 1 &&
                        board[row + 3][col + 3] == 1) {
                    return 1;
                }
                if (board[row][col] == 2 &&
                        board[row + 1][col + 1] == 2 &&
                        board[row + 2][col + 2] == 2 &&
                        board[row + 3][col + 3] == 2) {
                    return 2;
                }
            }
        }
        return 0;
    }

    private int checkReverseDiagonal(int[][] board) {
        // 3 is the cut off column
        // 2 if the cutoff row
        for (int row = 0; row < 3; row++) {
            for (int col = 3; col < board[row].length; col++) {
                if (board[row][col] == 1 &&
                        board[row + 1][col - 1] == 1 &&
                        board[row + 2][col - 2] == 1 &&
                        board[row + 3][col - 3] == 1) {
                    return 1;
                }
                if (board[row][col] == 2 &&
                        board[row + 1][col - 1] == 2 &&
                        board[row + 2][col - 2] == 2 &&
                        board[row + 3][col - 3] == 2) {
                    return 2;
                }
            }
        }
        return 0;
    }
}
