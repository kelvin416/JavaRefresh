package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class Exercise02 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};

        try {
            System.out.println(num[8]);
        } catch (IndexOutOfBoundsException exe){
            System.out.println(exe.getMessage());
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}

