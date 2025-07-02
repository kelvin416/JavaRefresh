package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class Exercise07{
    public static void main(String[] args) {

        try {
            byLiquor();
        } catch (UnderAgeException exe) {
            System.out.println(exe.toString());
        }
    }

    public static void byLiquor() throws UnderAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Naivas Liquor Store..");
        System.out.print("What is your age please: ");

        int age = scanner.nextInt();

        if (age < 18){
            throw new UnderAgeException();
        }

        System.out.println("Please feel free to look around and purchase your liquor.");
    }
}

class UnderAgeException extends Exception{

    @Override
    public String toString() {
        return "UnderAgeException{You are under the age of 18, no drinks for you}";
    }
}