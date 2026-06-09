package labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models;


import java.util.ArrayList;

public class Deck {

    private Card[] deck = new Card[52];
    private ArrayList<Integer> usedCards = new ArrayList<>();
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    private static int freshDeckLoaded;

    public Deck() {
        loadFreshDeck();
        freshDeckLoaded++;
    }

    private void loadFreshDeck() {
    }
}
