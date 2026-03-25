package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class EntryPoint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BlackJackGame blackJackGame = new BlackJackGame();
        blackJackGame.play();
    }
}
