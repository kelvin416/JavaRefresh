package labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models;

import java.util.Scanner;

public class CardPlayer {

    private String name;
    private int stackValue;

    public CardPlayer(){
        initializeNewUSer();
    }

    public CardPlayer(String name, int stackValue) {
        this.name = name;
        this.stackValue = stackValue;
    }

    private void initializeNewUSer() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to black jack. My name is computer, what is your name?");

        this.name = scanner.next();
        System.out.println("Thanks " + this.name+ " for joining. How much money are your placing?");
        this.stackValue = scanner.nextInt();

    }
}
