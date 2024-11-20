package Lab_09_2D_arrays.src;
public class TwoDArraysUtility {

    /** Student Self-Explanation
     * 
     * 
     * 
     * 
     */
    public boolean play(int player, int column, int[][] board) {
        //TODO: Student
        System.out.println("TESTING: " + board.length);
        for (int i = board.length - 1; i >= 0; i--){
            if (board[i][column-1] == 0){
                board[i][column-1] = player;
                return true;
            }
        }
        return false;
    }

    /** Student Self-Explanation
     *      * 
     * 
     * 
     * 
     */
    public int checkForWin(int[][] board) {
        //TODO: Student
        int winCheck = 0;
        for (int i = 0; i < board.length; i++){
            if ()
            for (int j = 0; j < board[i].length; j++){

            }
        }
        // Check vertical
        // Check horizontal
        // Check diagonal
        // Check other diagonal
        return 0;
    }
}
