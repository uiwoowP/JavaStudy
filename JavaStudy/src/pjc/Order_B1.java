package pjc;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;   
    
public class Order_B1 extends JFrame {
	
	String[] labelText = {"", "상품명", "수량", "업체코드"};
	
	Order_B1() {
		 setTitle("Order_B1");
		 setSize(400, 850);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 JPanel mainPanel = new JPanel(new GridBagLayout());
		 GridBagConstraints gbc = new GridBagConstraints();
		 
		 JButton backButton = new JButton("뒤로가기");
		 backButton.setPreferredSize(new Dimension(80, 40));
		 backButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		 
		 gbc.gridx = 0;
		 gbc.gridy = 0;
		 gbc.anchor = GridBagConstraints.LINE_START;
		 mainPanel.add(backButton, gbc);
		 
		 JLabel headLabel = new JLabel("발주 신청");
		 gbc.gridx = 0;
		 gbc.gridy = 1;
		 gbc.anchor = GridBagConstraints.CENTER;
		 gbc.insets = new Insets(200, 0, 0, 0);
		 mainPanel.add(headLabel, gbc);
		 
		 gbc.gridx = 0;
		 gbc.gridy = 1;
		 gbc.anchor = GridBagConstraints.CENTER;
		 gbc.insets = new Insets(200, 0, 0, 0);
		 mainPanel.add(headLabel, gbc);
		 
		 gbc.gridx = 0;
		 gbc.gridy = 2;
		 gbc.anchor = GridBagConstraints.CENTER;
		 gbc.insets = new Insets(50, 0, 0, 0);
		 
		 for (int i = 0; i < 4; ++i) {
			 JPanel rowPanel = new JPanel(new GridBagLayout());
			 GridBagConstraints rowGbc = new GridBagConstraints();
			 
			 JLabel label = new JLabel(labelText[i]);
			 label.setHorizontalAlignment(SwingConstants.CENTER);
			 label.setPreferredSize(new Dimension(100, 50));
			 
			 JTextField field = new JTextField(20);
			 field.setMaximumSize(new Dimension(200, 30));
		 }
		 
	}

	public static void main(String[] args) {
		new Order_B1();
	}
	
}