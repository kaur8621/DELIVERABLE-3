/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wardemo;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author HARMANPREET KAUR
 */
public class WarDemoTest {
    
    public WarDemoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }



    /**
     * Test of divideDeck method, of class WarDemo.
     */
    @Test
    public void testDivideDeckGood() {
        System.out.println("divideDeckGood");
        ArrayList<Card> Deck1 = new ArrayList<>(52);
        ArrayList<Card> Deck2 = new ArrayList<>(52);
        Deck deck = new Deck();
        WarDemo.divideDeck(Deck1, Deck2, deck);
      
    }
@Test
    public void testDivideDeckBad() {
        System.out.println("divideDeckBad");
        ArrayList<Card> Deck1 = new ArrayList<>(22);
        ArrayList<Card> Deck2 = new ArrayList<>(22);
        Deck deck = new Deck();
        WarDemo.divideDeck(Deck1, Deck2, deck);
      
    }
@Test
    public void testDivideDeckBoundary() {
        System.out.println("divideDeckBooundary");
        ArrayList<Card> Deck1 = new ArrayList<>(26);
        ArrayList<Card> Deck2 = new ArrayList<>(26);
        Deck deck = new Deck();;
        WarDemo.divideDeck(Deck1, Deck2, deck);
      
    }

  
    
}
