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


public class v2bj {

	void run (JPanel V2BJ) {
		JLabel v2_bj_label = new JLabel("v2 black jack");
		v2_bj_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		v2_bj_label.setBounds(191, 33, 133, 14);
		V2BJ.add(v2_bj_label);
	}
}
