public class Card {

    public String suit;
    public int value;
    public String name;

    public Card(int pName, int pSuit){
       //name = pName;
       //suit = pSuit;

       if(pName == 0){
           value = 11;
           name = "Ace";
       }
       if(pName == 1){
           value = 2;
           name = "Two";
       }
       if(pName == 12) {
           value = 10;
           name = "King";
       }
       if(pSuit == 0){
           suit = "Hearts";
       }
    }

    public void print(){
        System.out.println("The " + name + " of " + suit + " is worth " + value + " points ");
    }
}
