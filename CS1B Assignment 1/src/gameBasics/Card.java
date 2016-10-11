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
   
}
