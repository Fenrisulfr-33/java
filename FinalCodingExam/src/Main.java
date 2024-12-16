package FinalCodingExam.src;

/*
 * Copyright (c) 2020. 
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 20200624
 */
public class Main {
    /*
     * Given the following
     * 
     * 1,2,3,4,5,6,7
     * 10,20,30,40,50,60
     * 10.1,12.2,13.3,11.1,14.4,15.5
     * 
     * The output should be
     * 
     * Dataset Results (Method: AVERAGE)
     * Row 1: 4.0
     * Row 2: 35.0
     * Row 3: 12.8
     * 
     * Dataset Results (Method: MIN)
     * Row 1: 1.0
     * Row 2: 10.0
     * Row 3: 10.1
     * 
     * Dataset Results (Method: MAX)
     * Row 1: 7.0
     * Row 2: 60.0
     * Row 3: 15.5
     */

    public static void main(String[] args) {
        // String testFile = "sample.csv";
        String testFile = "FinalCodingExam\\src\\sample.csv";
        DataSet set = new DataSet(testFile);
        AverageDataCalc averages = new AverageDataCalc(set);
        System.out.println(averages);
        MinimumDataCalc minimum = new MinimumDataCalc(set);
        System.out.println(minimum);
        MaximumDataCalc max = new MaximumDataCalc(set);
        System.out.println(max);

    }

}

/*
 * AbstractDataCalc
 * AverageDataCalc
 * MaximumDataCalc
 * MinimumDataCalc
 */
