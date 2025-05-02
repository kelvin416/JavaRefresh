package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7: ");

        int number = scanner.nextInt();
        String text = "The day of the week is: ";

        while (number <= 7){
            if (number == 1){
                System.out.println(text + "Monday");
                break;
            } else if (number == 2) {
                System.out.println(text + "Tuesday");
                break;
            } else if (number == 3) {
                System.out.println(text + "Wednesday");
                break;
            } else if (number == 4) {
                System.out.println(text + "Thursday");
                break;
            } else if (number == 5) {
                System.out.println(text + "Friday");
                break;
            } else if (number == 6) {
                System.out.println(text + "Saturday");
                break;
            } else if (number == 7) {
                System.out.println(text + "Sunday");
                break;
            }
        }

    }
}
