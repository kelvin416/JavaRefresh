package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12: ");

        int days = scanner.nextInt();

        String str = "This month is: ";

        switch (days){
            case 1:
                System.out.println(str + "January");
                break;

            case 2:
                System.out.println(str + "February");
                break;

            case 3:
                System.out.println(str + "March");
                break;

            case 4:
                System.out.println(str + "April");
                break;

            case 5:
                System.out.println(str + "May");
                break;

            case 6:
                System.out.println(str + "June");
                break;

            case 7:
                System.out.println(str + "July");
                break;

            case 8:
                System.out.println(str + "August");
                break;

            case 9:
                System.out.println(str + "September");
                break;

            case 10:
                System.out.println(str + "October");
                break;

            case 11:
                System.out.println(str + "November");
                break;

            case 12:
                System.out.println(str + "December");
                break;

            default:
                System.out.println(str + "Enter a month.");
        }
    }
}
