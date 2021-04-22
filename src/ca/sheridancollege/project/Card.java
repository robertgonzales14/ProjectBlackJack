/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;
/**
 * Robert Gonzales
 * Deliverable 3
 * Blackjack
 * Campus: Davis
 * ID: 991616344
 */
/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public class Card 
{

    private Suit suit;
    private CardValue cardValue;
    
    public Card(Suit suit,CardValue cardValue){
        this.suit = suit;
        this.cardValue = cardValue;
        
    }
    
    public CardValue getCardValue(){
        return this.cardValue;
    }
	
    public Suit getSuit(){
        return this.suit;
    }
    
    public void setSuit(Suit suit)
  {
    this.suit = suit;
  }
    
    public void setCardValue(CardValue cardValue)
  {
    this.cardValue = cardValue;
  }
   
    public String toString(){
		return this.suit.toString() + " - " + this.cardValue.toString();
	}
    
}
