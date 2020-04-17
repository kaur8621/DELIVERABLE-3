/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wardemo;

/**
 *
 * @author HARMANPREET KAUR
 */
public abstract class Player {
      private String player1; //the unique ID for this player
     private String player2; 
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name1,String name2)
    {
        player1= name1;
        player1= name2;
    }
    
    /**
     * @return the playerID
     */
    public String getPlayer1() 
    {
        return player1;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayer1(String name1) 
    {
        player1 = name1;
    }
     public String getPlayer2() 
    {
        return player2;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayer2(String name2) 
    {
        player1 = name2;
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();
    
}
