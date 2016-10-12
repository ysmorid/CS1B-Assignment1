package gameBasics;

public class Hand {

   public final int MAX_CARDS = 100;
   private Card[] myCards;
   private int numCards;
   
   public Hand(){
   }
   
   public void resetHand(){
      myCards = new Card[0];
   }
   
}
