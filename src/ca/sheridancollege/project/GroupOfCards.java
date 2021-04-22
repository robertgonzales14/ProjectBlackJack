/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
/**
 * Robert Gonzales
 * Deliverable 3
 * Blackjack
 * Campus: Davis
 * ID: 991616344
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    
    public GroupOfCards()
    {
        this.cards = new ArrayList<Card>();
    }
    
    public void createDeck(){
        for(Suit cardSuit : Suit.values()){
			for(CardValue cardValue : CardValue.values()){
			//ADDS NEW CARD TO DECK
			this.cards.add(new Card(cardSuit,cardValue));
			}
		}
    }
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        //shuffles cards
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return this.cards.size();
    }

    public String toString(){
                //turns deck into string
		String cardListOutput = "";
		int i = 0;
		for(Card deck : this.cards){
			cardListOutput += "\n" + deck.toString();
			i++;
		}
		return cardListOutput;
    }
    
    public int cardsValue(){
		
		int value = 0;
                for(Card aCard : this.cards){
			//Gets card value and adds the assigned numeric value depending on the case
			switch(aCard.getCardValue()){
			case TWO: value += CardValue.TWO.getCardValue();
                        break;
                        
			case THREE: value += CardValue.THREE.getCardValue();
                        break;

			case FOUR: value += CardValue.FOUR.getCardValue();
                        break;
                        
			case FIVE: value += CardValue.FIVE.getCardValue();
                        break;
                        
			case SIX: value += CardValue.SIX.getCardValue();
                        break;
                        
			case SEVEN: value += CardValue.SEVEN.getCardValue();
                        break;
                        
			case EIGHT: value += CardValue.EIGHT.getCardValue(); 
                        break;
                        
			case NINE: value += CardValue.NINE.getCardValue(); 
                        break;
                        
			case TEN: value += CardValue.TEN.getCardValue(); 
                        break;
                        
			case JACK: value += CardValue.JACK.getCardValue(); 
                        break;
                        
			case QUEEN: value += CardValue.QUEEN.getCardValue();
                        break;
                        
			case KING: value += CardValue.KING.getCardValue(); 
                        break;
                        
			case ACE: value += CardValue.ACE.getCardValue(); 
                        break;
                        
                        }
                
                }
                    return value;
	}
    public Card getCard(int retCard)
    {
        return this.cards.get(retCard);
    }
    
    public Card removeCard(int retCard){
        return this.cards.remove(retCard);
    }
    
    public void addCard(Card addCard){
        this.cards.add(addCard);
    }
    
    public void draw(GroupOfCards draw){
		
	this.cards.add(draw.getCard(0));
		
	draw.removeCard(0);
	}
    
    public void returnHand(GroupOfCards returnHand){
        int thisDeckSize = this.cards.size();
		
		for(int i = 0; i < thisDeckSize; i++){
			returnHand.addCard(this.getCard(i));
		}
		
		for(int i = 0; i < thisDeckSize; i++){
			this.removeCard(0);
		}
    }
}
