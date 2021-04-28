import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import junit.framework.Test;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;
import java.awt.Color;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.border.MatteBorder;

public class Deck_of_cards {
    public String[] SUITS = {
            "_clubs", "_diamonds", "_hearts", "_spades"
        };
    
    public String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "jack", "queen", "king", "ace"
        };
    
    public int fifty_two = SUITS.length * RANKS.length;
    public String[] deck = new String[fifty_two];
    public int current_card;
    
    
    public void createdeck() {
    	current_card=0;
    	for (int i = 0; i < RANKS.length; i++) {
    		for (int j = 0; j < SUITS.length; j++) {
    			deck[SUITS.length*i + j] = RANKS[i] + "_of" + SUITS[j];
    		}
    	}
    }
    
    public void printdeck() {
    	for (int i = 0; i < fifty_two; i++) {
    		System.out.println(deck[i]);
    	}
    }
    
    public void shuffledeck() {
    	current_card=0;
    	for (int i = 0; i < fifty_two; i++) {
    		int r = i + (int) (Math.random() * (fifty_two-i));
    		String temp = deck[r];
    		deck[r] = deck[i];
    		deck[i] = temp;
    	}
    }
    
    //returns the next card in the deck
    public String return_next_card() {
    	if(current_card == 0) {
    		current_card=1;
    		return deck[0];
    	}
    	else {
    		current_card++;
    		return deck[current_card-1];
    	}
    }
    
    
    //returns the name of the image assoicated with the correct card. 
    public String return_next_card_file(String card) {
    	card=card+".png";
    	return card;
    }
    
}

