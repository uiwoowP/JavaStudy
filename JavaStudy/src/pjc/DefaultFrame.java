package pjc;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DefaultFrame {
	public static JFrame getDefaultFrame() {
		JFrame window = new JFrame();
		JLabel imgLabel = new JLabel();
		JPanel bluePanel = new JPanel();
		
		ImageIcon icon = new ImageIcon("imgs/ikea.png");
		imgLabel.setBounds(0, 6, 100, 38);
		imgLabel.setIcon(icon);
		
		bluePanel.setBounds(0, 0, 400, 50);
		bluePanel.setBackground(new Color(0, 88, 163));
		
		JPanel jpanel = new JPanel();
		
		jpanel.setBounds(0, 0, 400, 50);
		jpanel.setBackground(new Color(0, 88, 163));
		
		window.add(imgLabel);
		window.add(bluePanel);
		
		window.setSize(400, 850);
		window.setLayout(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		return window;
	}
}