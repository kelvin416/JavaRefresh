package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What game would you like to play?");
        System.out.println("Enter 1 for BlackJack, 2 for Card Draw, 3 for...");

        int userChoice = scanner.nextInt();

//        flow control
        if (userChoice == 1){
            BlackJackGame blackJackGame = new BlackJackGame();
            blackJackGame.play();
        } else if (userChoice == 2) {
            // create an obj of the 5 card poker game

        }

    }
}
