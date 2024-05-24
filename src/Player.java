public class Player {

    //is dealer or not
    public boolean isDealer;

    //sum of cards
    public int cardsSum;

    //bust or not
    public boolean isBust;

    //players' cards
    public Card[] hand;

    //params
    // is dealer
    //cards sum
    //isbust
    public Player(boolean pIsDealer, int pCardsSum, boolean pIsBust) {
        isDealer = pIsDealer;
        cardsSum = pCardsSum;
        isBust = pIsBust;
        hand = new Card[2];
    }

    public void print() {
        if (isDealer == true) {
            System.out.println("The dealer has " + cardsSum + " points.");
        } else {
            System.out.println("The player has " + cardsSum + " points.");
        }

        //TODO: print the hand
        for(int i = 0; i < hand.length; i++){
            hand[i].print();
        }

    }
}
