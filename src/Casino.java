public class Casino {

    public Card aceOfHearts;
    public Player jai;
    public Player dealer;
    public Card[] deck;

    public static void main(String[] args) {
        Casino Josh = new Casino();
    }

    public Casino() {
        System.out.println("Welcome to Josh's Casino!");

        deck = new Card [52];

        int door = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                aceOfHearts = new Card(i, j);
               // aceOfHearts.print();
                deck[door] = aceOfHearts;
                door ++;
            }
        }
        shuffle();
        printDeck();

        jai = new Player(false, 0, false);

        dealer = new Player(true, 0, false);

        deal();
        jai.print();
        dealer.print();
    }

    public void deal(){
        // give the player the first and second cards in our deck
        jai.hand[0] = deck[0];
        jai.hand[1] = deck[1];
        jai.cardsSum = jai.hand[1].value + jai.hand[0].value;

        dealer.hand[0] = deck[2];
        dealer.hand[1] = deck[3];
        dealer.cardsSum = dealer.hand[1].value + dealer.hand[0].value;
    }

    public void printDeck(){
        for(int i = 0; i < deck.length; i++){
            //System.out.println(deck[i]);
            deck[i].print();
        }
    }
    public void shuffle() {
        //need a loop to go through all cards
        //random index
        for (int i = 0; i < 52; i++) {
            int esme = (int) (Math.random() * 52);

            Card temp = deck[i];
            deck[i] = deck[esme];
            deck[esme] = temp;
        }
    }
    public void checkwinner(){
        if(jai.cardsSum > dealer.cardsSum) {
            System.out.println("Jai has blackjack and wins the hand!");
        }
        if(jai.cardsSum == dealer.cardsSum){
            System.out.println("Jai has the same amount as the dealer, Jai pushes!");
        }
        if(jai.cardsSum < dealer.cardsSum){
            System.out.println("Jai has less than the dealer, so the dealer wins the hand!");
        }
        if(jai.cardsSum == 21){
            System.out.println("Blackjack, Jai recieves a 3/2 pay ratio from the dealer!");
        }
        if(jai.cardsSum == 21){
            System.out.println("Blackjack, dealer wins the hand and takes all players money!");
        }
    }
}

