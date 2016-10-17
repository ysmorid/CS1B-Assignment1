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
      if(numCards >= MAX_CARDS){
         return false;
      }
      myCards[numCards] = card;
      numCards++;
      return true;
   }
   
   public Card playCard(){
      numCards--;
      return myCards[numCards];
   }
   
   public String toString(){
      return String.valueOf(myCards[numCards].getValue() + " of " + myCards[numCards].getSuit());
   }
   
   public int getNumCards(){
      return numCards;
   }
   
   public Card inspectCard(int k){
      if (k >= numCards){
         myCards[numCards].checkError();
      }
      return myCards[numCards];
   }
}
