import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import junit.framework.Test;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

import java.sql.*;
import java.awt.Color;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.border.MatteBorder;


public class v2bj {

	public int player_num_of_cards=2;

	/**
	 * @wbp.parser.entryPoint
	 */
	void run(JPanel V2BJ) {
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

		JLabel lblDealer = new JLabel("Dealer");
		lblDealer.setForeground(Color.WHITE);
		lblDealer.setBounds(433, 12, 97, 153);
		V2BJ.add(lblDealer);
		lblDealer.setFont(new Font("Dialog", Font.BOLD, 24));
		
		JPanel PlayerCards = new JPanel();
		PlayerCards.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		PlayerCards.setBackground(new Color(0, 100, 0));
		PlayerCards.setBounds(10, 176, 413, 149);
		V2BJ.add(PlayerCards);
		PlayerCards.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		JButton V2BJ_hit_btn = new JButton("Hit");
		V2BJ_hit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path;
				player_num_of_cards++;
				
			//card3
				
				if(player_num_of_cards == 3) {
					JLabel V2BJ_Player_C3 = new JLabel("");
					V2BJ_Player_C3.setBounds(10,11,52,130);
					
					path = Deck1.return_next_card_file(P_card3);
					v2bj obj = new v2bj();  
					Class class1 = obj.getClass();  
					URL PC3 = class1.getResource(path);  
					PlayerCards.add(V2BJ_Player_C3);
					ImageIcon MyImage = new ImageIcon(PC3);
					
					Image img = MyImage.getImage();
					Image newImg = img.getScaledInstance(V2BJ_Player_C3.getWidth(), V2BJ_Player_C3.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon image = new ImageIcon(newImg);
					V2BJ_Player_C3.setIcon(image);
					PlayerCards.add(V2BJ_Player_C3);
				}
				
			
			//card4
				if(player_num_of_cards == 4) {
					JLabel V2BJ_Player_C4 = new JLabel("");
					V2BJ_Player_C4.setBounds(10,11,52,130);
					
					path = Deck1.return_next_card_file(P_card4);
					v2bj obj = new v2bj();  
					Class class1 = obj.getClass();  
					URL PC4 = class1.getResource(path);  
					PlayerCards.add(V2BJ_Player_C4);
					ImageIcon MyImage = new ImageIcon(PC4);
					
					Image img = MyImage.getImage();
					Image newImg = img.getScaledInstance(V2BJ_Player_C4.getWidth(), V2BJ_Player_C4.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon image = new ImageIcon(newImg);
					V2BJ_Player_C4.setIcon(image);
					PlayerCards.add(V2BJ_Player_C4);
				}
			//card5
				if(player_num_of_cards == 5) {
					JLabel V2BJ_Player_C5 = new JLabel("");
					V2BJ_Player_C5.setBounds(10,11,52,130);
					
					path = Deck1.return_next_card_file(P_card5);
					v2bj obj = new v2bj();  
					Class class1 = obj.getClass();  
					URL PC5 = class1.getResource(path);  
					PlayerCards.add(V2BJ_Player_C5);
					ImageIcon MyImage = new ImageIcon(PC5);
					
					Image img = MyImage.getImage();
					Image newImg = img.getScaledInstance(V2BJ_Player_C5.getWidth(), V2BJ_Player_C5.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon image = new ImageIcon(newImg);
					V2BJ_Player_C5.setIcon(image);
					PlayerCards.add(V2BJ_Player_C5);
				}
			//card6
				if(player_num_of_cards == 6) {
					JLabel V2BJ_Player_C6 = new JLabel("");
					V2BJ_Player_C6.setBounds(10,11,52,130);
					
					path = Deck1.return_next_card_file(P_card6);
					v2bj obj = new v2bj();  
					Class class1 = obj.getClass();  
					URL PC6 = class1.getResource(path);  
					PlayerCards.add(V2BJ_Player_C6);
					ImageIcon MyImage = new ImageIcon(PC6);
					
					Image img = MyImage.getImage();
					Image newImg = img.getScaledInstance(V2BJ_Player_C6.getWidth(), V2BJ_Player_C6.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon image = new ImageIcon(newImg);
					V2BJ_Player_C6.setIcon(image);
					PlayerCards.add(V2BJ_Player_C6);
				}
			//card7
				if(player_num_of_cards == 7) {
					JLabel V2BJ_Player_C7 = new JLabel("");
					V2BJ_Player_C7.setBounds(10,11,52,130);
					
					path = Deck1.return_next_card_file(P_card7);
					v2bj obj = new v2bj();  
					Class class1 = obj.getClass();  
					URL PC7 = class1.getResource(path);  
					PlayerCards.add(V2BJ_Player_C7);
					ImageIcon MyImage = new ImageIcon(PC7);
					
					Image img = MyImage.getImage();
					Image newImg = img.getScaledInstance(V2BJ_Player_C7.getWidth(), V2BJ_Player_C7.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon image = new ImageIcon(newImg);
					V2BJ_Player_C7.setIcon(image);
					PlayerCards.add(V2BJ_Player_C7);
				}
			}
		});
		
		
		
		//PLAYER
			String pathP;
			//card1
				JLabel V2BJ_Player_C1 = new JLabel("");
				V2BJ_Player_C1.setBounds(10,11,52,130);
				
				pathP = Deck1.return_next_card_file(P_card1);
				v2bj obj = new v2bj();  
				Class class1 = obj.getClass();  
				URL PC1 = class1.getResource(pathP);  
				PlayerCards.add(V2BJ_Player_C1);
				ImageIcon MyImage = new ImageIcon(PC1);
				
				Image img = MyImage.getImage();
				Image newImg = img.getScaledInstance(V2BJ_Player_C1.getWidth(), V2BJ_Player_C1.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image = new ImageIcon(newImg);
				V2BJ_Player_C1.setIcon(image);
				PlayerCards.add(V2BJ_Player_C1);
			
			//card2
				JLabel V2BJ_Player_C2 = new JLabel("");
				V2BJ_Player_C2.setBounds(10,11,52,130);
				
				pathP = Deck1.return_next_card_file(P_card2);    
			    URL PC2 = class1.getResource(pathP);  
				PlayerCards.add(V2BJ_Player_C2);
				ImageIcon MyImage2 = new ImageIcon(PC2);
				
				Image img2 = MyImage2.getImage();
				Image newImg2 = img2.getScaledInstance(V2BJ_Player_C2.getWidth(), V2BJ_Player_C2.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image2 = new ImageIcon(newImg2);
				V2BJ_Player_C2.setIcon(image2);
				PlayerCards.add(V2BJ_Player_C2);
			
			
			
			
			JPanel DealerCards = new JPanel();
			DealerCards.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			DealerCards.setBackground(new Color(0, 100, 0));
			DealerCards.setBounds(10, 26, 413, 155);
			V2BJ.add(DealerCards);
			DealerCards.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		//DEALER
		
		String pathD;

			
		JLabel V2BJ_dealer_C1 = new JLabel("");
		V2BJ_dealer_C1.setBounds(10,11,52,130);	
		
		URL DC1 = class1.getResource("gray_back.png");  
		DealerCards.add(V2BJ_dealer_C1);
		ImageIcon MyImage3 = new ImageIcon(DC1); 
		
		Image img3 = MyImage3.getImage();
		Image newImg3 = img3.getScaledInstance(V2BJ_dealer_C1.getWidth(), V2BJ_dealer_C1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image3 = new ImageIcon(newImg3);
		V2BJ_dealer_C1.setIcon(image3);
		DealerCards.add(V2BJ_dealer_C1);
		
		
		JLabel V2BJ_dealer_C2 = new JLabel("");
		V2BJ_dealer_C2.setBounds(10,11,52,130);	
		
		pathD = Deck1.return_next_card_file(D_card2);    
	    URL DC2 = class1.getResource(pathD);  
		DealerCards.add(V2BJ_dealer_C2);
		ImageIcon MyImage4 = new ImageIcon(DC2);
		
		Image img4 = MyImage4.getImage();
		Image newImg4 = img4.getScaledInstance(V2BJ_dealer_C2.getWidth(), V2BJ_dealer_C2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image4 = new ImageIcon(newImg4);
		V2BJ_dealer_C2.setIcon(image4);
		DealerCards.add(V2BJ_dealer_C2);
		

		
		JLabel V2BJ_dealer_C3 = new JLabel("");
		V2BJ_dealer_C3.setBounds(10,11,52,130);
		//keep this path blank
		path = "";
		DealerCards.add(V2BJ_dealer_C3);
		ImageIcon MyImage5 = new ImageIcon(path);
		Image img5 = MyImage5.getImage();
		Image newImg5 = img5.getScaledInstance(V2BJ_dealer_C3.getWidth(), V2BJ_dealer_C3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image5 = new ImageIcon(newImg5);
		V2BJ_dealer_C3.setIcon(image5);
		DealerCards.add(V2BJ_dealer_C3);
		
		JLabel V2BJ_dealer_C4 = new JLabel("");
		V2BJ_dealer_C4.setBounds(10,11,52,130);
		//keep this path blank
		path = "";
		DealerCards.add(V2BJ_dealer_C4);
		ImageIcon MyImage6 = new ImageIcon(path);
		Image img6 = MyImage6.getImage();
		Image newImg6 = img6.getScaledInstance(V2BJ_dealer_C4.getWidth(), V2BJ_dealer_C4.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image6 = new ImageIcon(newImg6);
		V2BJ_dealer_C4.setIcon(image6);
		DealerCards.add(V2BJ_dealer_C4);
		
		JLabel V2BJ_dealer_C5 = new JLabel("");
		V2BJ_dealer_C5.setBounds(10,11,52,130);
		//keep this path blank
		path = "";
		DealerCards.add(V2BJ_dealer_C5);
		ImageIcon MyImage7 = new ImageIcon(path);
		Image img7 = MyImage7.getImage();
		Image newImg7 = img7.getScaledInstance(V2BJ_dealer_C5.getWidth(), V2BJ_dealer_C5.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image7 = new ImageIcon(newImg7);
		V2BJ_dealer_C5.setIcon(image7);
		DealerCards.add(V2BJ_dealer_C5);
		
		JLabel V2BJ_dealer_C6 = new JLabel("");
		V2BJ_dealer_C6.setBounds(10,11,52,130);
		//keep this path blank
		path = "";
		DealerCards.add(V2BJ_dealer_C6);
		ImageIcon MyImage8 = new ImageIcon(path);
		Image img8 = MyImage8.getImage();
		Image newImg8 = img8.getScaledInstance(V2BJ_dealer_C6.getWidth(), V2BJ_dealer_C6.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image8 = new ImageIcon(newImg8);
		V2BJ_dealer_C6.setIcon(image8);
		DealerCards.add(V2BJ_dealer_C6);
		
		JLabel V2BJ_dealer_C7 = new JLabel("");
		V2BJ_dealer_C7.setBounds(10,11,52,130);
		//keep this path blank
		path = "";
		DealerCards.add(V2BJ_dealer_C7);
		ImageIcon MyImage9 = new ImageIcon(path);
		Image img9 = MyImage9.getImage();
		Image newImg9 = img9.getScaledInstance(V2BJ_dealer_C7.getWidth(), V2BJ_dealer_C7.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image9 = new ImageIcon(newImg9);
		V2BJ_dealer_C6.setIcon(image9);
		DealerCards.add(V2BJ_dealer_C7);
		
		
		
		V2BJ_hit_btn.setBounds(440, 201, 76, 36);
		V2BJ.add(V2BJ_hit_btn);
		
		JButton V2BJ_advicebbutton = new JButton("Advice");
		V2BJ_advicebbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] playerhand = Deck1.return_player_hand(player_num_of_cards);
				int playertotal=Deck1.getPlayertotalBJ(playerhand,player_num_of_cards);
				String [] dealerhand=Deck1.return_dealer_hand();
				int dealertotal;
				
				dealerhand[0]=dealerhand[0].substring(0,2);
	    		if(dealerhand[0].equals("10")) {
	    			dealertotal=10;
	    			
	    		}
	    		dealerhand[1]=dealerhand[1].substring(0,1);
	    		if( dealerhand[1].equals("k") || dealerhand[1].equals("q") || dealerhand[1].equals("j")){
	    			dealertotal=10;
	    		}
	    		else if (dealerhand[1].equals("a")) {
	    			dealertotal=11;
	    		}
	    		else {
	    			int temp = Integer.parseInt(dealerhand[1]);
	    			dealertotal=temp;
	    		}
				if(playertotal<12 ) {
					JOptionPane.showMessageDialog(null,"Hit","Advice",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(playertotal==12 && (dealertotal!=6 && dealertotal!=6 && dealertotal!=5 && dealertotal!=4)) {
					JOptionPane.showMessageDialog(null,"Hit","Advice",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(playertotal==13 && (dealertotal!=6 && dealertotal!=6 && dealertotal!=5 && dealertotal!=4 && dealertotal!=3 && dealertotal!=2)) {
					JOptionPane.showMessageDialog(null,"Hit","Advice",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(playertotal==14 && (dealertotal!=6 && dealertotal!=6 && dealertotal!=5 && dealertotal!=4 && dealertotal!=3 && dealertotal!=2)) {
					JOptionPane.showMessageDialog(null,"Hit","Advice",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(playertotal==15 && (dealertotal!=6 && dealertotal!=6 && dealertotal!=5 && dealertotal!=4 && dealertotal!=3 && dealertotal!=2)) {
					JOptionPane.showMessageDialog(null,"Hit","Advice",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(playertotal==16 && (dealertotal!=6 && dealertotal!=6 && dealertotal!=5 && dealertotal!=4 && dealertotal!=3 && dealertotal!=2)) {
					JOptionPane.showMessageDialog(null,"Hit","Advice",JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"Stay","Advice",JOptionPane.INFORMATION_MESSAGE);

				}
			}
		});
		V2BJ_advicebbutton.setBounds(427, 328, 89, 23);
		V2BJ.add(V2BJ_advicebbutton);
		JButton V2BJ_stay_btn = new JButton("Stay");
		V2BJ_stay_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get player total
					String [] playerhand = Deck1.return_player_hand(player_num_of_cards);
					int playertotal=Deck1.getPlayertotalBJ(playerhand,player_num_of_cards);
					System.out.print("player total is: ");
					System.out.println(playertotal);
				//reveal dealer card1
					String path ;
					
					path = Deck1.return_next_card_file(D_card1);
					v2bj obj = new v2bj();  
					Class class1 = obj.getClass();  
					URL DC1 = class1.getResource(path);  
					DealerCards.add(V2BJ_dealer_C1);					
					ImageIcon MyImage3 = new ImageIcon(DC1);
					
					Image img3 = MyImage3.getImage();
					Image newImg3 = img3.getScaledInstance(V2BJ_dealer_C1.getWidth(), V2BJ_dealer_C1.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon image3 = new ImageIcon(newImg3);
					V2BJ_dealer_C1.setIcon(image3);
					DealerCards.add(V2BJ_dealer_C1);
				//get dealer total
					String [] dealerhand = Deck1.return_dealer_hand(); 
					int [] dealertotal = Deck1.return_dealer_total(dealerhand);
					System.out.print("dealer total is: ");
					System.out.println(dealertotal[0]);
					int num_dealer_cards = dealertotal[1];
					
				//show dealer hand
					
					//card 3
						if(num_dealer_cards >= 3) {
							path = Deck1.return_next_card_file(D_card3);
							URL DC3 = class1.getResource(path);  
							DealerCards.add(V2BJ_dealer_C3);
							ImageIcon MyImage4 = new ImageIcon(DC3);
							
							Image img4 = MyImage4.getImage();
							Image newImg4 = img4.getScaledInstance(V2BJ_dealer_C3.getWidth(), V2BJ_dealer_C3.getHeight(), Image.SCALE_SMOOTH);
							ImageIcon image4 = new ImageIcon(newImg4);
							V2BJ_dealer_C3.setIcon(image4);
							DealerCards.add(V2BJ_dealer_C3);
						}
					//card 4
						if(num_dealer_cards >= 4) {
							path = Deck1.return_next_card_file(D_card4);
							URL DC4 = class1.getResource(path);  
							DealerCards.add(V2BJ_dealer_C4);
							ImageIcon MyImage5 = new ImageIcon(DC4);
							
							Image img5 = MyImage5.getImage();
							Image newImg5 = img5.getScaledInstance(V2BJ_dealer_C4.getWidth(), V2BJ_dealer_C4.getHeight(), Image.SCALE_SMOOTH);
							ImageIcon image5 = new ImageIcon(newImg5);
							V2BJ_dealer_C4.setIcon(image5);
							DealerCards.add(V2BJ_dealer_C4);
						}
					//card 5
						if(num_dealer_cards >= 5) {
							path = Deck1.return_next_card_file(D_card5);
							URL DC5 = class1.getResource(path);  
							DealerCards.add(V2BJ_dealer_C5);
							ImageIcon MyImage6 = new ImageIcon(DC5);
							
							Image img6 = MyImage6.getImage();
							Image newImg6 = img6.getScaledInstance(V2BJ_dealer_C5.getWidth(), V2BJ_dealer_C5.getHeight(), Image.SCALE_SMOOTH);
							ImageIcon image6 = new ImageIcon(newImg6);
							V2BJ_dealer_C5.setIcon(image6);
							DealerCards.add(V2BJ_dealer_C5);
						}
					//card 6
						if(num_dealer_cards >= 6) {
							path = Deck1.return_next_card_file(D_card6);
							URL DC6 = class1.getResource(path);  
							DealerCards.add(V2BJ_dealer_C6);
							ImageIcon MyImage7 = new ImageIcon(DC6);
							
							Image img7 = MyImage7.getImage();
							Image newImg7 = img7.getScaledInstance(V2BJ_dealer_C6.getWidth(), V2BJ_dealer_C6.getHeight(), Image.SCALE_SMOOTH);
							ImageIcon image7 = new ImageIcon(newImg7);
							V2BJ_dealer_C6.setIcon(image7);
							DealerCards.add(V2BJ_dealer_C6);
						}
					//card 7
						if(num_dealer_cards >= 7) {
							path = Deck1.return_next_card_file(D_card7);
							URL DC7 = class1.getResource(path);  
							DealerCards.add(V2BJ_dealer_C7);
							ImageIcon MyImage8 = new ImageIcon(DC7);
							
							Image img8 = MyImage8.getImage();
							Image newImg8 = img8.getScaledInstance(V2BJ_dealer_C7.getWidth(), V2BJ_dealer_C7.getHeight(), Image.SCALE_SMOOTH);
							ImageIcon image8 = new ImageIcon(newImg8);
							V2BJ_dealer_C7.setIcon(image8);
							DealerCards.add(V2BJ_dealer_C7);
						}
					
				

					

				
			}
		});
		
		JButton V2BJ_reset_btn_1 = new JButton("Reset");
		V2BJ_reset_btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("NEW ROUND");
				V2BJ.removeAll();
				v2bj BJv2 = new v2bj();
				BJv2.run(V2BJ);
			}
		});
		
		V2BJ_reset_btn_1.setBounds(440, 116, 76, 36);
		V2BJ.add(V2BJ_reset_btn_1);
		
		V2BJ_stay_btn.setBounds(440, 249, 76, 36);
		V2BJ.add(V2BJ_stay_btn);
	}
}
