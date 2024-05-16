public class Card {
    //suit -> spade, hearts, diamond
    public String suit;
    //value -> 1-11
    public int value;
    //name -> Ace, 2, 3, ... jack, queen, king
    public String name;

    Card Ace = new Card(); //Card constructor
    public void print(){ //print method
        System.out.println("the Ace of hearts is worth either 1 point or 11 points");
    }
}
