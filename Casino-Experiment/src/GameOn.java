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
		LoginMenuHeader.setBounds(28, 22, 372, 42);
		LoginMenu.add(LoginMenuHeader);
		
		JLabel UserIDLabel = new JLabel("User ID:");
		UserIDLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		UserIDLabel.setBounds(104, 81, 58, 14);
		LoginMenu.add(UserIDLabel);
		
		JTextField UserIDText = new JTextField();
		UserIDText.setFont(new Font("Tahoma", Font.PLAIN, 14));
		UserIDText.setBounds(191, 80, 86, 20);
		LoginMenu.add(UserIDText);
		UserIDText.setColumns(10);
		
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordLabel.setBounds(104, 125, 73, 14);
		LoginMenu.add(passwordLabel);
		
		JTextField passwordText = new JTextField();
		passwordText.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordText.setBounds(191, 122, 86, 20);
		LoginMenu.add(passwordText);
		passwordText.setColumns(10);
		JButton SubmitButton = new JButton("Submit");
		SubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=UserIDText.getText();
				//System.out.println(userName);
				String password=passwordText.getText();
				//System.out.println(password);
				if(userName.equals("NightHawk")&&password.equals("abc12345")) {
					System.out.println("Here");
					Version1.setVisible(true);
					LoginMenu.setVisible(false);
				}
				if(userName.equals("SkyHawk")&&password.equals("abc12345")) {
					Version2.setVisible(true);
					LoginMenu.setVisible(false);
				}
			}
		});
		SubmitButton.setBounds(175, 176, 102, 46);
		
		LoginMenu.add(SubmitButton);
		
		
		
		
		
		JLabel Version1Header = new JLabel("Welcome to Version 1 ");
		Version1Header.setHorizontalAlignment(SwingConstants.LEFT);
		Version1Header.setBounds(145, 27, 170, 14);
		Version1.add(Version1Header);
		
		JButton V1BlackJackButton = new JButton("Play Black Jack");
		V1BlackJackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Version1.setVisible(false);
				V1BJ.setVisible(true);
			}
		});
		V1BlackJackButton.setBounds(43, 169, 140, 23);
		Version1.add(V1BlackJackButton);
		
		JButton V1PokerButton = new JButton("Play poker");
		V1PokerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Version1.setVisible(false);
				V1Poker.setVisible(true);
			}
		});
		V1PokerButton.setBounds(273, 169, 89, 23);
		Version1.add(V1PokerButton);
		

		
		
		
		
		JLabel Version2Header = new JLabel("Welcome to version 2");
		Version2Header.setHorizontalAlignment(SwingConstants.LEFT);
		Version2Header.setBounds(189, 30, 188, 14);
		Version2.add(Version2Header);
		
		JButton v2BlackJackButton = new JButton("Play Black Jack");
		v2BlackJackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Version2.setVisible(false);
				V2BJ.setVisible(true);
			}
		});
		v2BlackJackButton.setBounds(76, 150, 130, 23);
		Version2.add(v2BlackJackButton);
		
		JButton v2PokerButton = new JButton("Play Poker ");
		v2PokerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Version2.setVisible(false);
				V2Poker.setVisible(true);
			}
		});
		v2PokerButton.setBounds(304, 150, 89, 23);
		Version2.add(v2PokerButton);
		


		
		JLabel v1_bj_label = new JLabel("Version 1 Black Jack");
		v1_bj_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		v1_bj_label.setBounds(205, 29, 148, 14);
		V1BJ.add(v1_bj_label);
		
		JButton V1BJ_hit_btn = new JButton("Hit");
		V1BJ_hit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		V1BJ_hit_btn.setBounds(363, 91, 89, 23);
		V1BJ.add(V1BJ_hit_btn);
		
		JButton V1BJ_stay_btn = new JButton("Stay");
		V1BJ_stay_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		V1BJ_stay_btn.setBounds(363, 125, 89, 23);
		V1BJ.add(V1BJ_stay_btn);
		
		JButton V1BJ_yes_btn = new JButton("Yes");
		V1BJ_yes_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		V1BJ_yes_btn.setBounds(363, 178, 89, 23);
		V1BJ.add(V1BJ_yes_btn);
		
		JButton V1BJ_no_btn = new JButton("No");
		V1BJ_no_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		V1BJ_no_btn.setBounds(363, 212, 89, 23);
		V1BJ.add(V1BJ_no_btn);
		
		JPanel DealerCards = new JPanel();
		DealerCards.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		DealerCards.setBackground(new Color(0, 100, 0));
		DealerCards.setBounds(10, 73, 343, 108);
		V1BJ.add(DealerCards);
		DealerCards.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel V1BJ_dealer_C1 = new JLabel("");
		DealerCards.add(V1BJ_dealer_C1);
		
		JLabel V1BJ_dealer_C2 = new JLabel("");
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
		
		JPanel PlayerCards = new JPanel();
		PlayerCards.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		PlayerCards.setBackground(new Color(0, 100, 0));
		PlayerCards.setBounds(10, 192, 343, 108);
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
