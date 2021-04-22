/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 *
 * @author Robth
 */
public class GameInfo extends Game{
    

    public GameInfo(String givenName)
    {
        super(givenName);
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void declareWinnerPlayer(){
        
        System.out.println("\nPLAYER WINS");
    }

    @Override
    public void declareWinnerDealer() {
        System.out.println("\nDEALER WINS");
    }

    @Override
    public void declareBustDealer() {
        System.out.println("\nDEALER BUST");
    }

    @Override
    public void declareBustPlayer() {
        System.out.println("\nPLAYER BUST");
    }

    @Override
    public void declareGameOver() {
         System.out.println("\nGAME OVER");
    }
    
}
