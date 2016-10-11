package testPackage;
import static org.junit.Assert.*;
import org.junit.Test;

import gameBasics.Card;
import gameBasics.Card.Suit;

public class CardTest {
   Card test = new Card();
   
   @Test
   public void testSetCardValue() {
      assertEquals(false, test.setCard('k', Suit.SPADES));
      assertEquals(true, test.setCard('p', Suit.SPADES));
   }

}