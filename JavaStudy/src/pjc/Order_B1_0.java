package pjc;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Order_B1_0 extends JFrame {
	
	boolean isShow = true;
	
	
	public Order_B1_0() {
		setTitle("Order_B1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JLabel headLabel = new JLabel();
		headLabel.setIcon(new ImageIcon("ikea_logo_small.png"));
		JLabel headText = new JLabel("발주 신청");
		
		JPanel headPanel = new JPanel();
		headPanel.setSize(new Dimension(400, 50));
		headPanel.setAlignmentX(LEFT_ALIGNMENT);
		headPanel.setBackground(Color.decode("#0058A3"));
		headPanel.setLocation(20, 0);
		headPanel.add(headLabel);
		headPanel.add(headText);
		add(headPanel);
		
		setSize(400, 800);
		setVisible(isShow);
		
	}
	
	public static void main(String[] args) {
		new Order_B1_0();
	}

}
