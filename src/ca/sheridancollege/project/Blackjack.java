/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;
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
public class Blackjack {
    
    
    public static void main(String[] args){
        double balance = 100;
         
        Scanner input = new Scanner(System.in);
        Blackjack game = new Blackjack();
         //creates instance for Player
        
        
        System.out.println("Enter username: ");
        String username = input.nextLine();
        GameInfo info = new GameInfo("Blackjack");//creates instance for gameinfo
        PlayerData player = new PlayerData(username);
        player.setBalance(balance);
        boolean validation = true;//to keep while 
        while(validation)//while true
		{
                        System.out.println("Welcome to Blackjack! " + player.getPlayerID() + "!");
                        System.out.println("Your balance: " + player.getBalance());
			System.out.println("How much do you want to bet?");//Asks user amount to bet
                        double userBet = input.nextDouble();//userbet is next numbbers inputed
                        player.setBet(userBet);//sets userbet
                        //if user is greater than balance or equal to 0, ask user to enter valid bet
			if(userBet > player.getBalance() || userBet == 0)
					{
				System.out.println("Please enter a valid bet");
                                //if user balance = 0, declare gameover on next user input 
                                if(player.getBalance() == 0){
                                info.declareGameOver();
                                validation = false; //ends loop and code
                        }
				
			}
                        
			else//if userbet is viable, deduct bet amount from balance and run game menu
			{
				player.betDeduc(userBet);
                                game.runmenu(player,info);
			}
                        
                            
		}
        
        
        
    }
    public void runmenu(PlayerData player, GameInfo info){
        double finalBalance;
        boolean gamevalid = false;
        Scanner input = new Scanner(System.in);
        GroupOfCards Deck = new GroupOfCards(); //creates instance for main ceck
        GroupOfCards playerHand = new GroupOfCards();//Creates playerHand instance
        GroupOfCards dealersHand = new GroupOfCards(); //creates dealersHand instance
        
        //Creates Deck and shuffles the deck twice
        Deck.createDeck();
	Deck.shuffle();
        Deck.shuffle();
        
        //playerHand draws 2 from deck
        playerHand.draw(Deck);
        playerHand.draw(Deck);
        
        //dealersHand draws 2 from deck
        dealersHand.draw(Deck);
        dealersHand.draw(Deck);
        //While loop for user input, if user inputs 1, loop continues, if user inputs 2, loops breaks
        while(true){
        System.out.println("\nUsername: " + player.getPlayerID());
        System.out.println("Your bet: " + player.getBet()); //Displays current bet
        System.out.println("Your balance: " + player.getBalance()); //Displays balance
        System.out.println("\nYour hand:" + playerHand); //displays dealers first card in hand
       
        System.out.println("Dealers Hand: " + dealersHand.getCard(0).toString() + " [HIDDEN CARD]\n");//Displays dealers first card in hand, second card is face down
        //Displays players handvalue
        System.out.println("Current Hand Value: " + playerHand.cardsValue());
        
        System.out.println("Would you like to HIT(1) or STAND(2)");
        int userChoice = input.nextInt();
        
        if(userChoice == 1){
            //If user chooses 1 draw a card
            playerHand.draw(Deck);
            
            //displays the drawn card
            System.out.println("Drawed a " + playerHand.getCard(playerHand.getSize()-1));
            //if cardsValue goes over 21, declare bust and declare dealer as winner
            if(playerHand.cardsValue() > 21){
                info.declareBustPlayer();//calls from playerData user lost
                info.declareWinnerDealer();
                info.declareGameOver();
                System.out.println("Final Hand Value: " + playerHand.cardsValue());
                gamevalid = true;//sets gamevalid to true so the if commands do not run
                break;//breaks loop
            }
              
        }
        if(userChoice ==2){
            break;//breaks loop
        }
        
        }
        System.out.println("\nDealers Hand: " + dealersHand);
        
        //While loop so dealer must keep drawing if under 17
        while(dealersHand.cardsValue() < 17 && gamevalid == false)
        {
            System.out.println("Dealer draws");
            dealersHand.draw(Deck);
            
        }
        System.out.println("Dealers Hand Value: " + dealersHand.cardsValue());
        
        //The following if commands only runs if gamevalid == false
        //If dealers hand exceeds 21
        if(dealersHand.cardsValue() > 21 && gamevalid == false){
           info.declareBustDealer();
           info.declareWinnerPlayer();
           //multiplies the bet value by 2 and adds it to user balance
           finalBalance = (player.getBet() * 2) + player.getBalance();
           player.setBalance(finalBalance);
           //sets gamevalid to true to prevent the rest of if commands from running
           gamevalid = true;
        }
        //If dealers and players hand cardsvalue are equal
        if(dealersHand.cardsValue() == playerHand.cardsValue() && gamevalid == false){
            System.out.println("\nPUSH! Returning bets");
            finalBalance = player.getBet() + player.getBalance(); //returns bet to balance
            player.setBalance(finalBalance);
            gamevalid = true;
            
        }
        //if dealers hand value is greater than playerhand value
        if(dealersHand.cardsValue() > playerHand.cardsValue() && gamevalid == false){
            info.declareWinnerDealer();
            //dealer loses userbet
            finalBalance = player.getBalance();
            player.setBalance(finalBalance);
            gamevalid = true;
        }
        //if players hand is greater than dealers hand
        if(dealersHand.cardsValue() < playerHand.cardsValue() && gamevalid == false){
            info.declareWinnerPlayer();
            //win multiplier is 2x, multiplies the userbet by 2 and adds it to current balance
            finalBalance = (player.getBet() * 2) + player.getBalance();
            player.setBalance(finalBalance);
            gamevalid = true;
        }
        
        //Returns player and dealers hand to deck
        playerHand.returnHand(Deck);
        dealersHand.returnHand(Deck);
        System.out.println("\nReturned Cards to Deck\n");
        //Code then goes back to main
        
    }
    
    
    
}//end of code
