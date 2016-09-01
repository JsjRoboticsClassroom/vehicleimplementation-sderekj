package nyc.c4q.abassawo;

/**
 * Created by c4q-ac29 on 8/31/16.
 */
public class CardDeck {
    private PlayingCard[] cards = new PlayingCard[52];

    public CardDeck(){
        int i = 0;
        PlayingCard card;

        for(PlayingCard.Suit suit : PlayingCard.Suit.values()){
            while(i <= 13){
                i++;
                // code here - 1 to 13
                System.out.println(suit);
                System.out.println(i - 1);
                card = new PlayingCard(suit, i);
                cards[i - 1] = card;
            }
        }

    }
}
