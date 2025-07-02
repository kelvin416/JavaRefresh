package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {

        try {
            division();
        } catch (ArithmeticException exe){
            System.out.println("Number cannot be divide by Zero");
        }

    }

    public static void division() throws ArithmeticException{
        int a = 4;
        int b = 0;

        if (a == 0 || b == 0){
            throw new ArithmeticException();
        }
        System.out.println( a / b);
    }

}