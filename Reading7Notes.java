public class Reading7Notes {
    // %(flags)(width)(.precision)specifier

    /*
        width 
        printf("Value: %7.2f", myFloat); // Value:   12.34

        .precision
            printf("%.4f", myFloat); //12.3400
            printf("%3.4e", myFloat); //1.2340e+01

        flags
            printf("%+f", myFloat); // +12.340000
            printf("%08.2f", myFloat); // 00012.34
            * This includes the decimal *

        int myInt = -713;

        * The number speicifices the amount of places including the '-' sign *
        printf("%+04d", myInt); // -713 
        printf("%05d", myInt); // -0713
        printf("%+02d", myInt); // -713, can't truncate the value less then it is.


        width 
            printf("%20s String", myString); 
                      Formatting String
        .precision
            printf("%.6s", myString); 
            Format
        flags
            printf("%-20s String", myString);
                Formatting           String

        String myString = "Testing";

        printf("%4s", myString); // Testing - prints 4 but string is 7
        printf("%8s", myString); // " Testing" - prints 8 but is 7
        printf("%.4s", myString); // Test - only prints 4
        printf("%.10s", myString); // Testing - only prints 7 / 10
        printf("%-8s123", myString); // Testing 123 - 7 char, 1 padding, flag after

    */
}
