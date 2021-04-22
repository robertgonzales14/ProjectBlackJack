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
public class PlayerData extends Player{
    private double balance;
    private double userBet;
    public PlayerData(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setBet(double userBet){
        this.userBet = userBet;
    }
    public double getBet(){
        return userBet;
    }
    public void betDeduc(double userBet) { 
	if(userBet <= this.balance) //If withdraw is less than or equal to the current balance execute this command
	this.balance -= userBet;
	}
    
    
}
