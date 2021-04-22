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
public class GameOn {

	private JFrame frame;
	private JPanel LoginMenu;
	private JPanel Version1;
	private JPanel Version2;
	private JPanel V1BJ;
	private JPanel V1Poker;
	private JPanel V2BJ;
	private JPanel V2Poker;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameOn window = new GameOn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameOn() {
		initialize();
	}

	
	
    public static class Deck_of_cards {
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
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 542, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel LoginMenu = new JPanel();
		frame.getContentPane().add(LoginMenu, "name_4343745660300");
		LoginMenu.setLayout(null);
		
		JPanel Version1 = new JPanel();
		frame.getContentPane().add(Version1, "name_4349689398100");
		Version1.setLayout(null);
		Version1.setVisible(false);
		
		JPanel Version2 = new JPanel();
		frame.getContentPane().add(Version2, "name_4353048810800");
		Version2.setLayout(null);
		Version2.setVisible(false);
		
		JPanel V1BJ = new JPanel();
		V1BJ.setBackground(new Color(0, 100, 0));
		frame.getContentPane().add(V1BJ, "name_197826228458100");
		V1BJ.setLayout(null);
		V1BJ.setVisible(false);
		
		JPanel V1Poker = new JPanel();
		frame.getContentPane().add(V1Poker, "name_197828629444900");
		V1Poker.setLayout(null);
		V1Poker.setVisible(false);
		
		JPanel V2BJ = new JPanel();
		frame.getContentPane().add(V2BJ, "name_197863179604800");
		V2BJ.setLayout(null);
		V2BJ.setVisible(false);
		
		JPanel V2Poker = new JPanel();
		frame.getContentPane().add(V2Poker, "name_197866494180300");
		V2Poker.setLayout(null);
		V2Poker.setVisible(false);
		
		JLabel LoginMenuHeader = new JLabel("Enter your Regestration info below");
		LoginMenuHeader.setFont(new Font("Calibri", Font.BOLD, 24));
		LoginMenuHeader.setBounds(28, 22, 475, 42);
		LoginMenu.add(LoginMenuHeader);
		
		JLabel UserIDLabel = new JLabel("User ID:");
		UserIDLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		UserIDLabel.setBounds(148, 93, 58, 14);
		LoginMenu.add(UserIDLabel);
		
		JTextField UserIDText = new JTextField();
		UserIDText.setFont(new Font("Tahoma", Font.PLAIN, 14));
		UserIDText.setBounds(224, 90, 86, 20);
		LoginMenu.add(UserIDText);
		UserIDText.setColumns(10);
		
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordLabel.setBounds(133, 125, 73, 14);
		LoginMenu.add(passwordLabel);
		
		JTextField passwordText = new JTextField();
		passwordText.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordText.setBounds(224, 122, 86, 20);
		LoginMenu.add(passwordText);
		passwordText.setColumns(10);
		JButton SubmitButton = new JButton("Submit");
		SubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=UserIDText.getText();
				//System.out.println(userName);
				String password=passwordText.getText();
				//System.out.println(password);
				if(userName.equals("1")&&password.equals("a")) {
					System.out.println("Here");
					Version1.setVisible(true);
					LoginMenu.setVisible(false);
				}
				if(userName.equals("2")&&password.equals("b")) {
					Version2.setVisible(true);
					LoginMenu.setVisible(false);
				}
			}
		});
		SubmitButton.setBounds(210, 178, 102, 46);
		
		LoginMenu.add(SubmitButton);
		
		JButton V1BlackJackButton = new JButton("Play Black Jack");
		V1BlackJackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Version1.setVisible(false);
				V1BJ.setVisible(true);
			}
		});
		
		JLabel lblVersion = new JLabel("Version 1");
		lblVersion.setVerticalAlignment(SwingConstants.BOTTOM);
		lblVersion.setFont(new Font("Dialog", Font.BOLD, 24));
		lblVersion.setBounds(201, 64, 145, 42);
		Version1.add(lblVersion);
		V1BlackJackButton.setBounds(62, 213, 196, 51);
		Version1.add(V1BlackJackButton);
		
		JButton V1PokerButton = new JButton("Play poker");
		V1PokerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Version1.setVisible(false);
				V1Poker.setVisible(true);
			}
		});
		V1PokerButton.setBounds(270, 213, 196, 51);
		Version1.add(V1PokerButton);
		
		JButton v2BlackJackButton = new JButton("Play Black Jack");
		v2BlackJackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Version2.setVisible(false);
				V2BJ.setVisible(true);
			}
		});
		
		JLabel lblVersion_2 = new JLabel("Version 2");
		lblVersion_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblVersion_2.setFont(new Font("Dialog", Font.BOLD, 24));
		lblVersion_2.setBounds(195, 68, 145, 42);
		Version2.add(lblVersion_2);
		v2BlackJackButton.setBounds(74, 234, 196, 51);
		Version2.add(v2BlackJackButton);
		
		JButton v2PokerButton = new JButton("Play Poker ");
		v2PokerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Version2.setVisible(false);
				V2Poker.setVisible(true);
			}
		});
		v2PokerButton.setBounds(282, 234, 196, 51);
		Version2.add(v2PokerButton);
		
		JButton V1BJ_hit_btn = new JButton("Hit");
		V1BJ_hit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblDealer = new JLabel("Dealer");
		lblDealer.setForeground(Color.WHITE);
		lblDealer.setBounds(433, 12, 97, 153);
		V1BJ.add(lblDealer);
		lblDealer.setFont(new Font("Dialog", Font.BOLD, 24));
		
		JPanel PlayerCards = new JPanel();
		PlayerCards.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		PlayerCards.setBackground(new Color(0, 100, 0));
		PlayerCards.setBounds(10, 176, 413, 149);
		V1BJ.add(PlayerCards);
		PlayerCards.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel V1BJ_Player_C1 = new JLabel("");
		PlayerCards.add(V1BJ_Player_C1);
		
		JLabel V1BJ_Player_C2 = new JLabel("");
		PlayerCards.add(V1BJ_Player_C2);
		
		JLabel V1BJ_Player_C3 = new JLabel("");
		PlayerCards.add(V1BJ_Player_C3);
		
		JLabel V1BJ_Player_C4 = new JLabel("");
		PlayerCards.add(V1BJ_Player_C4);
		
		JLabel V1BJ_Player_C5 = new JLabel("");
		PlayerCards.add(V1BJ_Player_C5);
		
		JLabel V1BJ_Player_C6 = new JLabel("");
		PlayerCards.add(V1BJ_Player_C6);
		
		JLabel V1BJ_Player_C7 = new JLabel("");
		PlayerCards.add(V1BJ_Player_C7);
		
		JPanel DealerCards = new JPanel();
		DealerCards.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		DealerCards.setBackground(new Color(0, 100, 0));
		DealerCards.setBounds(10, 26, 413, 155);
		V1BJ.add(DealerCards);
		DealerCards.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		
		Deck_of_cards Deck1 = new Deck_of_cards();
		Deck1.createdeck();
		Deck1.shuffledeck();
		//creating player cards
		String P_card1=Deck1.return_next_card();
		String P_card2=Deck1.return_next_card();
		String P_card3=Deck1.return_next_card();
		String P_card4=Deck1.return_next_card();
		String P_card5=Deck1.return_next_card();
		String P_card6=Deck1.return_next_card();
		String P_card7=Deck1.return_next_card();
		//creating dealer cards
		String D_card1=Deck1.return_next_card();
		String D_card2=Deck1.return_next_card();
		String D_card3=Deck1.return_next_card();
		String D_card4=Deck1.return_next_card();
		String D_card5=Deck1.return_next_card();
		String D_card6=Deck1.return_next_card();
		String D_card7=Deck1.return_next_card();
		String path;
		path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";

		
		JLabel V1BJ_dealer_C1 = new JLabel("");
		V1BJ_dealer_C1.setBounds(10,11,52,130);	
		path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
		path=path+Deck1.return_next_card_file(D_card1);
		DealerCards.add(V1BJ_dealer_C1);
		ImageIcon MyImage = new ImageIcon(path);
		Image img = MyImage.getImage();
		Image newImg = img.getScaledInstance(V1BJ_dealer_C1.getWidth(), V1BJ_dealer_C1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		V1BJ_dealer_C1.setIcon(image);
		DealerCards.add(V1BJ_dealer_C1);
		
		
		JLabel V1BJ_dealer_C2 = new JLabel("");
		V1BJ_dealer_C2.setBounds(10,11,52,130);	
		path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
		path=path+Deck1.return_next_card_file(D_card2);
		DealerCards.add(V1BJ_dealer_C2);
		ImageIcon MyImage2 = new ImageIcon(path);
		Image img2 = MyImage2.getImage();
		Image newImg2 = img2.getScaledInstance(V1BJ_dealer_C2.getWidth(), V1BJ_dealer_C2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image2 = new ImageIcon(newImg2);
		V1BJ_dealer_C2.setIcon(image2);
		DealerCards.add(V1BJ_dealer_C2);
		

		
		JLabel V1BJ_dealer_C3 = new JLabel("");
		DealerCards.add(V1BJ_dealer_C3);
		
		JLabel V1BJ_dealer_C4 = new JLabel("");
		DealerCards.add(V1BJ_dealer_C4);
		
		JLabel V1BJ_dealer_C5 = new JLabel("");
		DealerCards.add(V1BJ_dealer_C5);
		
		JLabel V1BJ_dealer_C6 = new JLabel("");
		DealerCards.add(V1BJ_dealer_C6);
		
		JLabel V1BJ_dealer_C7 = new JLabel("");
		DealerCards.add(V1BJ_dealer_C7);
		V1BJ_hit_btn.setBounds(440, 201, 76, 36);
		V1BJ.add(V1BJ_hit_btn);
		
		JButton V1BJ_stay_btn = new JButton("Stay");
		V1BJ_stay_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		V1BJ_stay_btn.setBounds(440, 249, 76, 36);
		V1BJ.add(V1BJ_stay_btn);
		
	
		
		
		JLabel v1_poker_label = new JLabel("V1 poker");
		v1_poker_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		v1_poker_label.setBounds(205, 33, 73, 14);
		V1Poker.add(v1_poker_label);
		

		
		JLabel v2_bj_label = new JLabel("v2 black jack");
		v2_bj_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		v2_bj_label.setBounds(191, 33, 133, 14);
		V2BJ.add(v2_bj_label);
		
		
		JLabel v2_poker_label = new JLabel("v2 poker ");
		v2_poker_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		v2_poker_label.setBounds(208, 21, 73, 14);
		V2Poker.add(v2_poker_label);
	}
}
