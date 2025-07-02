package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class Exercise04{
    public static void main(String[] args) {
        int[] num1 = {23, 23, 98, 0, 28, 28};
        int[] num2 = {87, 55, 3, 7, 0};

        try {
            int a = num1[2];
            int b = num2[4];

            try {
                System.out.println(a / b);
            } catch (ArithmeticException arExe){
                System.out.println("Division by zero is not possible");
            }
        } catch (IndexOutOfBoundsException exe){
            System.out.println(exe.getMessage());
        }
    }
}