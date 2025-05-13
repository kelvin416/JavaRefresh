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

        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Number " + (i + 1) + ": ");
        }

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        int avg = sum / numbers.length;

        System.out.println("\n Sum of the numbers: " + sum);
        System.out.println("\n Avg of the numbers: " + avg);
    }

}