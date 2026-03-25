package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

//        so here the user just writes a number between 1 and 10, and the system will show you the index of that number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any number between 1 - 10");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            numbers.add(i);
        }

        System.out.println("Enter a number between 1 and 10");

        if (scanner.hasNext()){
            int user = scanner.nextInt();

            int index = numbers.indexOf(user);

            if (index != -1){
                System.out.println("Index of " + user + " is: " + (index - 1));
            } else {
                System.out.println("Number not found in the array.");
            }
        } else {
            System.out.println("Invalid input!!");
        }



        // write code here


    }
}