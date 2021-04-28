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


public class v1p {
	
	void run(JPanel V1Poker) {
		JLabel v1_poker_label = new JLabel("V1 poker");
		v1_poker_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		v1_poker_label.setBounds(205, 33, 73, 14);
		V1Poker.add(v1_poker_label);
		
		JLabel lblTest = new JLabel("test");
		lblTest.setBounds(215, 48, 70, 15);
		V1Poker.add(lblTest);
		
	}

}
