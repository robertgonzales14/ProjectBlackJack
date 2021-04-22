/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Robth
 */
public class BlackjackTest {
    
    public BlackjackTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    /**
     * Test of runmenu method, of class Blackjack.
     */
    @Test
    public void testRunmenuGood() {
        System.out.println("runmenu");
        String username = "Kite";
        String gamename = "Blackjack";
        PlayerData player = new PlayerData(username);
        GameInfo info = new GameInfo(gamename);
        Blackjack instance = new Blackjack();
        instance.runmenu(player, info);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testRunmenuBad() {
        System.out.println("runmenu");
        String username = "";
        String gamename = "";
        PlayerData player = new PlayerData(username);
        GameInfo info = new GameInfo(gamename);
        Blackjack instance = new Blackjack();
        instance.runmenu(player, info);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testRunmenuBoundary() {
        System.out.println("runmenu");
        String username = "";
        String gamename = "";
        PlayerData player = new PlayerData(username);
        GameInfo info = new GameInfo(gamename);
        Blackjack instance = new Blackjack();
        instance.runmenu(player, info);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
