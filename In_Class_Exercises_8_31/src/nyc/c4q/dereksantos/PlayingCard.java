package nyc.c4q.dereksantos;

public class PlayingCard {

    Suit suit;
    int value;

    public PlayingCard(Suit suit, int value) { // this is a constructor
        this.suit = suit;
        this.value = value;
    }

    public PlayingCard(int value) { // this is another constructor

    }

    public int getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return suit;
    }

    public enum Suit {
        DIAMONDS, SPADES, CLUB, HEARTS
    }

}
