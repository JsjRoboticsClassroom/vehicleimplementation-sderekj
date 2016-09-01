package nyc.c4q.abassawo;

/**
 * Created by c4q-ac29 on 8/31/16.
 */
public class PlayingCard implements Card {
    Suit suit;
    int value;

    public PlayingCard(Suit suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public Suit getSuit() {
        return suit;
    }



    public enum Suit{
        DIAMOND, SPADE, CLUB, HEART
    }


}
