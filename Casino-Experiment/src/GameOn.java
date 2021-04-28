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
	public JPanel V1BJ;
	public JPanel V1Poker;
	public JPanel V2BJ;
	public JPanel V2Poker;
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
		
		V1Poker = new JPanel();
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
		
		//runs blackjack version1 (v1bj.java)
		v1bj BJv1 = new v1bj();
		BJv1.run(V1BJ);
	
		
		//runs poker version 1 (v1p.java)
		v1p Pv1 = new v1p();
		Pv1.run(V1Poker);
		
		v2bj BJv2 = new v2bj();
		BJv2.run(V2BJ);
		
		//runs poker version 2 (v2p.java)
		v2p Pv2 = new v2p();
		Pv2.run(V2Poker);
		
		
	
	}
}
