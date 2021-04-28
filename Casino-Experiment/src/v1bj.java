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

public class v1bj {
	public int player_num_of_cards=2;

	void run(JPanel V1BJ) {
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
		
		
		JButton V1BJ_hit_btn = new JButton("Hit");
		V1BJ_hit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path;
				path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
				player_num_of_cards++;
				System.out.println(player_num_of_cards);
				
			//card3
				
				if(player_num_of_cards == 3) {
					JLabel V1BJ_Player_C3 = new JLabel("");
					V1BJ_Player_C3.setBounds(10,11,52,130);
					path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
					path=path+Deck1.return_next_card_file(P_card3);
					PlayerCards.add(V1BJ_Player_C3);
					ImageIcon MyImage = new ImageIcon(path);
					Image img = MyImage.getImage();
					Image newImg = img.getScaledInstance(V1BJ_Player_C3.getWidth(), V1BJ_Player_C3.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon image = new ImageIcon(newImg);
					V1BJ_Player_C3.setIcon(image);
					PlayerCards.add(V1BJ_Player_C3);
				}
				
			
			//card4
				if(player_num_of_cards == 4) {
					JLabel V1BJ_Player_C4 = new JLabel("");
					V1BJ_Player_C4.setBounds(10,11,52,130);
					path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
					path=path+Deck1.return_next_card_file(P_card4);
					PlayerCards.add(V1BJ_Player_C4);
					ImageIcon MyImage = new ImageIcon(path);
					Image img = MyImage.getImage();
					Image newImg = img.getScaledInstance(V1BJ_Player_C4.getWidth(), V1BJ_Player_C4.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon image = new ImageIcon(newImg);
					V1BJ_Player_C4.setIcon(image);
					PlayerCards.add(V1BJ_Player_C4);
				}
			//card5
				if(player_num_of_cards == 5) {
					JLabel V1BJ_Player_C5 = new JLabel("");
					V1BJ_Player_C5.setBounds(10,11,52,130);
					path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
					path=path+Deck1.return_next_card_file(P_card5);
					PlayerCards.add(V1BJ_Player_C5);
					ImageIcon MyImage = new ImageIcon(path);
					Image img = MyImage.getImage();
					Image newImg = img.getScaledInstance(V1BJ_Player_C5.getWidth(), V1BJ_Player_C5.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon image = new ImageIcon(newImg);
					V1BJ_Player_C5.setIcon(image);
					PlayerCards.add(V1BJ_Player_C5);
				}
			//card6
				if(player_num_of_cards == 6) {
					JLabel V1BJ_Player_C6 = new JLabel("");
					V1BJ_Player_C6.setBounds(10,11,52,130);
					path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
					path=path+Deck1.return_next_card_file(P_card6);
					PlayerCards.add(V1BJ_Player_C6);
					ImageIcon MyImage = new ImageIcon(path);
					Image img = MyImage.getImage();
					Image newImg = img.getScaledInstance(V1BJ_Player_C6.getWidth(), V1BJ_Player_C6.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon image = new ImageIcon(newImg);
					V1BJ_Player_C6.setIcon(image);
					PlayerCards.add(V1BJ_Player_C6);
				}
			//card7
				if(player_num_of_cards == 7) {
					JLabel V1BJ_Player_C7 = new JLabel("");
					V1BJ_Player_C7.setBounds(10,11,52,130);
					path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
					path=path+Deck1.return_next_card_file(P_card7);
					PlayerCards.add(V1BJ_Player_C7);
					ImageIcon MyImage = new ImageIcon(path);
					Image img = MyImage.getImage();
					Image newImg = img.getScaledInstance(V1BJ_Player_C7.getWidth(), V1BJ_Player_C7.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon image = new ImageIcon(newImg);
					V1BJ_Player_C7.setIcon(image);
					PlayerCards.add(V1BJ_Player_C7);
				}
			}
		});
		
		
		
		//PLAYER
		
			//card1
				JLabel V1BJ_Player_C1 = new JLabel("");
				V1BJ_Player_C1.setBounds(10,11,52,130);
				path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
				path=path+Deck1.return_next_card_file(P_card1);
				PlayerCards.add(V1BJ_Player_C1);
				ImageIcon MyImage = new ImageIcon(path);
				Image img = MyImage.getImage();
				Image newImg = img.getScaledInstance(V1BJ_Player_C1.getWidth(), V1BJ_Player_C1.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image = new ImageIcon(newImg);
				V1BJ_Player_C1.setIcon(image);
				PlayerCards.add(V1BJ_Player_C1);
			
			//card2
				JLabel V1BJ_Player_C2 = new JLabel("");
				V1BJ_Player_C2.setBounds(10,11,52,130);
				path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
				path=path+Deck1.return_next_card_file(P_card2);
				PlayerCards.add(V1BJ_Player_C2);
				ImageIcon MyImage2 = new ImageIcon(path);
				Image img2 = MyImage2.getImage();
				Image newImg2 = img2.getScaledInstance(V1BJ_Player_C2.getWidth(), V1BJ_Player_C2.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image2 = new ImageIcon(newImg2);
				V1BJ_Player_C2.setIcon(image2);
				PlayerCards.add(V1BJ_Player_C2);
			
			
			
			
			JPanel DealerCards = new JPanel();
			DealerCards.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			DealerCards.setBackground(new Color(0, 100, 0));
			DealerCards.setBounds(10, 26, 413, 155);
			V1BJ.add(DealerCards);
			DealerCards.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		//DEALER
		
		JLabel V1BJ_dealer_C1 = new JLabel("");
		V1BJ_dealer_C1.setBounds(10,11,52,130);	
		path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
		path=path+Deck1.return_next_card_file(D_card1);
		DealerCards.add(V1BJ_dealer_C1);
		ImageIcon MyImage3 = new ImageIcon(path);
		Image img3 = MyImage3.getImage();
		Image newImg3 = img3.getScaledInstance(V1BJ_dealer_C1.getWidth(), V1BJ_dealer_C1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image3 = new ImageIcon(newImg3);
		V1BJ_dealer_C1.setIcon(image3);
		DealerCards.add(V1BJ_dealer_C1);
		
		
		JLabel V1BJ_dealer_C2 = new JLabel("");
		V1BJ_dealer_C2.setBounds(10,11,52,130);	
		path = "/home/dreh/git/HCI-Casino-experiment/Casino-Experiment/Images/";
		path=path+Deck1.return_next_card_file(D_card2);
		DealerCards.add(V1BJ_dealer_C2);
		ImageIcon MyImage4 = new ImageIcon(path);
		Image img4 = MyImage4.getImage();
		Image newImg4 = img4.getScaledInstance(V1BJ_dealer_C2.getWidth(), V1BJ_dealer_C2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image4 = new ImageIcon(newImg4);
		V1BJ_dealer_C2.setIcon(image4);
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
				//reveal dealer cards here
			}
		});
		V1BJ_stay_btn.setBounds(440, 249, 76, 36);
		V1BJ.add(V1BJ_stay_btn);
	}

}
