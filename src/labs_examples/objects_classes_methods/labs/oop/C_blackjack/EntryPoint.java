package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class EntryPoint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game space center");
        System.out.println("Enter 1 to play BlackJack Game or Enter 2 to play a 5 card Draw game...");

        int userChoice = scanner.nextInt();

        if (userChoice == 1){
            BlackJackGame blackJackGame = new BlackJackGame();
            blackJackGame.play();
        } else if (userChoice == 2) {
            // create a 5 card draw user object
        } else {
            System.out.println("Select a number and try again.");
        }

    }
}
