public class RPA2 {
    char[] barb = { 'c', 'o', 'n', 'a', 'n' };
    String barb2 = "conan";
    char[] barb3 = new char[20];

    /*
     * Compile Error
     *      barb2[0] = "C";
     *      barb3 = barb2;
     *      barb[0] = "C";
     * 
     * Runtime exception
     *      barb3[3] = barb[barb3.length -1 ];
     *      barb[barb.length] = 'N';
     * 
     * Uncategorized answers
     *      barb[barb2.length() - 1] = 'N';
     *      barb3 = barb;
     *      barb[0] = 0;
     *      barb[0] = 'C';
     */
    // barb3 = barb;
    // barb[0] = 0;
    // barb[0] = 'C';

    private static int doSomething(int[] arr) {
        int val = 0;
        for (int i = 0; i < arr.length; i += 2) {
            val += arr[i];
        }
        return val + arr.length;
    }

    private static int doSomethingElse(int[] arr) {
        int val = 0;
        for(int i = 0; i < arr.length; i++) {
            val += arr[i];
        }
        return val;
    }

    public static void main(String[] args) {
        int[] arr = new int[13];
        arr[0] = -3;
        arr[1] = 6;
        arr[0] = 10;
        arr[2] = 8;
        arr[3] = 10;
        arr[8] = 7;
        for (int i = 0; i < arr.length; i++){
            System.out.println("i: " + arr[i]);
        }
        System.out.println(doSomething(arr));
        int[] arr2 = {-2, -9, -7, -2, -6, -4};
        System.out.println(doSomethingElse(arr2));
    }
}
