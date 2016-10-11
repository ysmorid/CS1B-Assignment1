package gameBasics;

public class Card {
   
   public enum Suit {HEARTS, SPADES, CLUBS, DIAMONDS};
   private Suit suit;
   private char value;
   private boolean errorFlag;
  
   public Card(){

      this('A', Suit.SPADES);
   }
   
   public Card(char value, Suit suit){
     setCard(value, suit);
   }
     
   public boolean setCard(char value, Suit suit)
   {
      this.suit = suit;
      char upValue = Character.toUpperCase(value);
            
      if (upValue == 'A' || upValue == 'K' || upValue == 'Q' || upValue == 'J'
            || upValue == 'T' || (upValue >= '2' && upValue <= '9'))
         this.value = upValue;
      else
      {
         errorFlag = true;
         this.value = 'A';
      }
      return errorFlag;
   }
   
   public String toString()
   {
      String returnValue;
      if (errorFlag){
         returnValue = "This is an invalid card."; 
      }
      else{
         returnValue = String.valueOf(value) + " of " + suit;
      }
      return returnValue;
   }
   
   public char getValue(){
      return value;
   }
   
   public Suit getSuit(){
      return suit;
   }
   
   public boolean checkError(){
      return errorFlag;
   }
   
   public boolean equals(Card card){
      boolean identical = false;
      
      if(this.value == card.value &&
      this.suit == card.suit){
         identical = true;
      }
      return identical;
   }
}
