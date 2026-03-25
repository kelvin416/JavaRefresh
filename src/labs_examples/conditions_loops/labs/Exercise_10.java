package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {

        System.out.println("This will print out only odd numbers as follows:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0){
                continue;
            }

            System.out.println(i);
        }
    }
}
