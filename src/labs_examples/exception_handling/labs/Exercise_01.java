package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise01{
    public static void main(String[] args) {
        int[] numbers = {23, 45, 1, 90};
        try {
            System.out.println(numbers[5]);
        } catch (IndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }
    }
}

