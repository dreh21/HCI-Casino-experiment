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


public class v2p {
	
	void run(JPanel V2Poker) {
		JLabel v2_poker_label = new JLabel("v2 poker");
		v2_poker_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		v2_poker_label.setBounds(208, 21, 73, 14);
		V2Poker.add(v2_poker_label);
	}

}
