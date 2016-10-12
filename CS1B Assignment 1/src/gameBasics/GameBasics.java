package gameBasics;

public class GameBasics {

   public static void main(String[] args) {

      Card card1 = new Card();
      Card card2 = new Card('p', Card.Suit.DIAMONDS);
      Card card3 = new Card('j', Card.Suit.CLUBS);
      
      System.out.println(card1.toString());
      System.out.println(card2.toString());
      System.out.println(card3.toString());
      System.out.println("");
      
      card1.setCard('1', Card.Suit.HEARTS);
      card2.setCard('Q', Card.Suit.SPADES);
      
      System.out.println(card1.toString());
      System.out.println(card2.toString());
      System.out.println(card3.toString());

   }

}
