package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        System.out.println("Enter 10 random numbers: ");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Number " + (1 + i) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        avg = sum / numbers.length;

        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the numbers is: " + avg);

    }

}