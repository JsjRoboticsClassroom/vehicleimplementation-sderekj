package nyc.c4q.dereksantos;

public class CardDeck {
    private PlayingCard[] cards = new PlayingCard[52]; // this refers to the size of the deck

    public CardDeck() {
        int i = 1;
        PlayingCard card;
        for (PlayingCard.Suit suit : PlayingCard.Suit.values()) { // for each loop
            while (i <= 13) {
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
