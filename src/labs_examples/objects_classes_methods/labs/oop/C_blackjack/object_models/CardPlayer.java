package labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models;


import java.util.Scanner;

public class CardPlayer {

    private String playerName;
    private int stackValue;

    public CardPlayer() {
        initializeNewUser();
    }

    public CardPlayer(String playerName, int stackValue) {
        this.playerName = playerName;
        this.stackValue = stackValue;
    }

    private void initializeNewUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome to BlackJack");
        this.playerName = scanner.next();

        System.out.println("Welcome to the game " + this.playerName + "! How much money are you playing?");
        this.stackValue = scanner.nextInt();

    }
}
