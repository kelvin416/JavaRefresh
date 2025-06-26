package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models.CardPlayer;
import labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models.Deck;
import labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models.Game;

public class BlackJackGame extends Game {

    public void play(){

        setName("BlackJack");
        setBasicRules("The player closest to 21 without going over wins");

        CardPlayer computer = new CardPlayer("Computer", 10000);
        CardPlayer user = new CardPlayer();

        Deck deck;

        do {
            deck = new Deck();

            System.out.println("\nGame # " + Deck.getFreshDecksLoaded());
            
            printAsciiArt();

            handleBets();
        } while (true);
    }

    private void printAsciiArt() {
        System.out.println(" ---------------------");
        System.out.println(" Welcome To BlackJack ");
        System.out.println(" /     \\");
        System.out.println("| () () |");
        System.out.println(" \\  ^  /");
        System.out.println("  |||||");
        System.out.println("  |||||");
        System.out.println(" -------------------- ");
    }
}
