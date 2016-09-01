package nyc.c4q.dereksantos;

public class Main {

    public static void main(String[] args) {
//        PlayingCard playingCard = new PlayingCard(PlayingCard.Suit.CLUB, 1);
//        playingCard.suit = PlayingCard.Suit.CLUB; // you just assigned the suit of the card to Club, this is redundant vs. above line
//        System.out.println(playingCard.getValue());
//        System.out.println(playingCard.getSuit());

        CardDeck deck = new CardDeck();

//        CardDeck deck = null;
//        do {
//            deck = new CardDeck();
//        } while (deck == null);

        System.out.println(deck);

        /**********************/


//        Vehicle vehicle = new Bicycle(0);
//        vehicle = new AstonMartin();
//        vehicle.applyBrakes();

        Vehicle bike1 = new Bicycle(0);
        bike1.slowDown(21);
        bike1.speedUp(0);
        bike1.applyBrakes(12);


    }
}
