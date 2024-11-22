package Lab_10.src;

public class RecursionHelper {
    /**
     * reverseString
     * takes in a str and returns the flipped result
     * 
     * @param str
     * @return str
     */
    public String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        }
        // call reverse with the string less one char
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    /**
     * pow
     * Get the power (y) of (x)
     * 
     * @param int int x
     * @param y
     * @return int
     */
    public int pow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        // call pow with the base number with one less multiplier
        return x * pow(x, y - 1);
    }

    /**
     * palindromeChecker
     * take in a string and return a boolean if it is a palindrome
     * a palindrome is a word spelled either way that results in the same word
     * 
     * @param str
     * @return boolean
     */
    public boolean palindromeChecker(String str) {
        // if only one letter remains it is a palindrome
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // if first equals last call palindromeChecker
        return palindromeChecker(str.substring(1, str.length() - 1));
    }

}
