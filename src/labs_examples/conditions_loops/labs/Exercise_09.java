package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Checking number: " + i);

            if (i == 7) {
                System.out.println("Number 7 found! Exiting the loop.");
                break;
            }
        }

        System.out.println("Loop has ended.");
    }
}
