package gameBasics;

public class Hand {

   public final int MAX_CARDS = 50;
   private Card[] myCards = new Card[MAX_CARDS];
   private int numCards;
   
   public Hand(){
      resetHand();
   }
   
   public void resetHand(){
      myCards = new Card[MAX_CARDS];
   }
 
   public boolean takeCard(Card card){
      
   }
   
   public Card playCard(){
      
   }
}
