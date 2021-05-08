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
    
    
    //used for printing blackjack hands
    public void printdeck() {
    	System.out.println();
    	System.out.println("Player deck:");
    	
    	for (int i = 0; i < 7; i++) {
    		System.out.println(deck[i]);
    	}
    	System.out.println();
    	System.out.println("Dealer deck");
    	for (int i = 7; i < 14; i++) {
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
    
    //returns the players hand
    public String[] return_player_hand(int numcards) {
    	String [] ret = new String [7];
    	for(int i =0; i<numcards; i++) {
    		ret[i]=deck[i];
    	}
    	return ret;
    	
    }
    
    //returns the players total
    public int getPlayertotalBJ(String [] playerhand, int numcards){
    	int ret =0;
    	int has_ace = 0;
    	
    	for(int i =0; i<numcards; i++) {
    		playerhand[i]=playerhand[i].substring(0,2);
    		if(playerhand[i].equals("10")) {
    			ret+=10;
    			continue;
    		}
    		playerhand[i]=playerhand[i].substring(0,1);
    		if( playerhand[i].equals("k") || playerhand[i].equals("q") || playerhand[i].equals("j")){
    			ret+=10;
    		}
    		else if (playerhand[i].equals("a")) {
    			has_ace ++;
    		}
    		else {
    			int temp = Integer.parseInt(playerhand[i]);
    			ret+=temp;
    		}
    	}
    	if(has_ace > 0) {
    		if(has_ace == 1) {
    			if(ret+11 > 21) {
    				ret+=1;
    			}
    			else {
    				ret+=11;
    			}
    		}
    		else if(has_ace ==2) {
    			if(ret+11 > 21) {
    				ret+=1;
    			}
    			else {
    				ret+=11;
    			}
    			if(ret+11 > 21) {
    				ret+=1;
    			}
    			else {
    				ret+=11;
    			}	
    		}
    		else if(has_ace ==3) {
    			if(ret+11 > 21) {
    				ret+=1;
    			}
    			else {
    				ret+=11;
    			}
    			if(ret+11 > 21) {
    				ret+=1;
    			}
    			else {
    				ret+=11;
    			}
    			if(ret+11 > 21) {
    				ret+=1;
    			}
    			else {
    				ret+=11;
    			}	
    		}
    		else if(has_ace ==4) {
    			if(ret+11 > 21) {
    				ret+=1;
    			}
    			else {
    				ret+=11;
    			}
    			if(ret+11 > 21) {
    				ret+=1;
    			}
    			else {
    				ret+=11;
    			}
    			if(ret+11 > 21) {
    				ret+=1;
    			}
    			else {
    				ret+=11;
    			}
    			if(ret+11 > 21) {
    				ret+=1;
    			}
    			else {
    				ret+=11;
    			}	
    		}
    	}
    	
    	
    	return ret;
    }
    
    //returns the name of the image assoicated with the correct card. 
    public String return_next_card_file(String card) {
    	card=card+".png";
    	return card;
    }

    
    //returns the dealers hand
    public String [] return_dealer_hand() {
    	String [] dealerhand = new String [7];
    	dealerhand[0]=deck[7];
    	dealerhand[1]=deck[8];
    	dealerhand[2]=deck[9];
    	dealerhand[3]=deck[10];
    	dealerhand[4]=deck[11];
    	dealerhand[5]=deck[12];
    	dealerhand[6]=deck[13];
    	return dealerhand;
    	
    }

    //returns the dealer total
	public int [] return_dealer_total(String[] playerhand) {
		boolean player_has_ace = false;
		int ret =0;
		int dealer_card_number =0;
    	int has_ace = 0;
    	int [] total = new int [2];
    	for(int i =0; i<2; i++) {
    		playerhand[i]=playerhand[i].substring(0,2);
    		if(playerhand[i].equals("10")) {
    			ret+=10;
    			continue;
    		}
    		playerhand[i]=playerhand[i].substring(0,1);
    		if( playerhand[i].equals("k") || playerhand[i].equals("q") || playerhand[i].equals("j")){
    			ret+=10;
    		}
    		else if (playerhand[i].equals("a")) {
    			has_ace ++;
    			player_has_ace = true;
    		}
    		else {
    			int temp = Integer.parseInt(playerhand[i]);
    			ret+=temp;
    		}
    	}
    	if(has_ace==1) {
    		ret +=11;
    	}
    	else if(has_ace==2) {
    		ret=12;
    	}
		for(int i =2; i<7; i++) {
			boolean has_ace2=false;
			if(ret<=16) {
				//dealer hits
					dealer_card_number=i+1;
					playerhand[i]=playerhand[i].substring(0,2);
					if(playerhand[i].equals("10")) {
		    			ret+=10;
		    			continue;
		    		}
		    		playerhand[i]=playerhand[i].substring(0,1);
		    		if( playerhand[i].equals("k") || playerhand[i].equals("q") || playerhand[i].equals("j")){
		    			ret+=10;
		    		}
		    		else if (playerhand[i].equals("a")) {
		    			has_ace2 = true;
		    			player_has_ace = true;
		    		}
		    		else {
		    			int temp = Integer.parseInt(playerhand[i]);
		    			ret+=temp;
		    		}
		    	
		    		if(has_ace2==true) {
		    			if(ret+11>21) {
		    				ret+=1;
		    			}
		    			else {
		    				ret+=11;
		    			}
		    		if(player_has_ace = true && ret >21) {
		    			ret=ret-10;
		    		}
		    		}

			}		
			else {
				dealer_card_number=i;
				break;
			}
		
		}
		total[0]=ret;
		total[1]=dealer_card_number;
		
		return total;
	}
}

