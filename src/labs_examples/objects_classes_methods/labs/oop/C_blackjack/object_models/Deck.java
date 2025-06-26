package labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models;

import java.util.ArrayList;

public class Deck {
    private Card[] deck = new Card[52];
    private ArrayList<Integer> usedCards = new ArrayList<>();
    char[] suit = new char[]{'S', 'D', 'H', 'F'};
    private static  int freshDecksLoaded;

    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    public char[] getSuit() {
        return suit;
    }

    public void setSuit(char[] suit) {
        this.suit = suit;
    }

    public static int getFreshDecksLoaded() {
        return freshDecksLoaded;
    }

    public static void setFreshDecksLoaded(int freshDecksLoaded) {
        Deck.freshDecksLoaded = freshDecksLoaded;
    }

    public Deck(){
        loadFreshDeck();
        freshDecksLoaded++;
    }

    private void loadFreshDeck() {

        int count = 0;

        for (int x = 0; x < 4; x++){
            for (int i = 1; i < 14; i++){

                if (i == 1 ){
                    deck[count] = new Card(suit [x], "ACE");
                } else if (i == 11) {
                    deck[count] = new Card(suit[x], "JACK");
                } else if (i == 12) {
                    deck[count] = new Card(suit[x], "QUEEN");
                } else if (i == 13) {
                    deck[count] = new Card(suit[x], "KING");
                } else {
                    deck[count] = new Card(suit[x], Integer.toString(i).toUpperCase());
                }
                count++;
            }
        }
    }
}
