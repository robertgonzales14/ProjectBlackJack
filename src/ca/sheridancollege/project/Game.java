/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
/**
 * Robert Gonzales
 * Deliverable 3
 * Blackjack
 * Campus: Davis
 * ID: 991616344
 */
/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public abstract class Game 
{
    private final String gameName;//the title of the game

    
    public Game(String givenName)
    {
        gameName = givenName;
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinnerPlayer();
    
    public abstract void declareWinnerDealer();
    
    public abstract void declareBustDealer();
    
    public abstract void declareBustPlayer();
    
    public abstract void declareGameOver();

   
    
}//end class
