package pjc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import database.DBConnector;

public class Order_B1 extends JFrame {
	
	boolean isClientExist = false;
	static Font font = new Font("나눔글꼴", Font.PLAIN, 14);
	boolean isShow = false;
	DBConnector connector = new DBConnector("HR", "1234");
	Dimension textField = new Dimension(200, 35);
	
	JTextField name, qty, cId;
	
	Order_B1() {
		 setTitle("Order_B1");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLayout(new GridBagLayout());
		 
		 JButton backButton = new JButton("뒤로가기");
		 backButton.setFont(font);
		 backButton.setSize(new Dimension(80, 40));
		 
		 JLabel head = new JLabel("발주신청");
		 JPanel headPanel = new JPanel();
		 
		 head.setFont(new Font("나눔글꼴", Font.PLAIN, 15));
		 headPanel.add(head);
		 
		 headPanel.setAlignmentY(CENTER_ALIGNMENT);
		 headPanel.setPreferredSize(textField);
		 headPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		 
		 JButton date = new JButton();
		 date.setPreferredSize(new Dimension(200, 35));
		 date.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		 Date today = new Date();
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		 date.setText(dateFormat.format(today));
		 date.setFont(new Font("나눔글꼴", Font.PLAIN, 15));
		 
		 name = new JTextField();
		 name.setPreferredSize(textField);
		 name.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		 qty = new JTextField();
		 qty.setPreferredSize(textField);
		 qty.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		 cId = new JTextField();
		 cId.setPreferredSize(textField);
		 cId.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		 
		 JLabel nameLabel = new JLabel("상품명");
		 nameLabel.setFont(font);
		 JLabel qtyLabel = new JLabel("수량");
		 qtyLabel.setFont(font);
		 JLabel cIdLabel = new JLabel("업체코드");
		 cIdLabel.setFont(font);
		 
		 JButton submit = new JButton("신청하기");
		 submit.setFont(font);
		 submit.setSize(80, 40);
		 submit.addActionListener(new ActionListener() {
			 
			 @Override
			 public void actionPerformed(ActionEvent e) {

				if (isClientExist) {
					JDialog dialog = new JDialog(Order_B1.this, "알림", true);
					dialog.setSize(200, 150);
					dialog.setLocation(150, 300);
					dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

					JLabel label = new JLabel("신청이 완료되었습니다.");
					label.setFont(font);
					label.setHorizontalAlignment(SwingConstants.CENTER);
					dialog.add(label, BorderLayout.CENTER);

					JButton okButton = new JButton("확인");
					okButton.setFont(font);
					okButton.setSize(80, 40);
					okButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							dialog.dispose();
						}
						});

					JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
					buttonPanel.add(okButton);
					dialog.add(buttonPanel, BorderLayout.SOUTH);

					dialog.setVisible(true);
					} else {
						JDialog dialog = new JDialog(Order_B1.this, "알림", true);
						dialog.setSize(200, 150);
						dialog.setLocation(150, 300);
						dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

						JLabel label = new JLabel("등록된업체 코드가 아닙니다");
						label.setFont(font);
						label.setHorizontalAlignment(SwingConstants.CENTER);
						dialog.add(label, BorderLayout.CENTER);

						JButton okButton = new JButton("확인");
						okButton.setFont(font);
						okButton.setSize(80, 40);
						okButton.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								dialog.dispose();
							}
							});

						JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
						buttonPanel.add(okButton);
						dialog.add(buttonPanel, BorderLayout.SOUTH);

						dialog.setVisible(true);
						
					}
				}
			});
		 
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.weightx = 0.5;
	        gbc.weighty = 0.5;
	        gbc.gridx = 1;
	        gbc.gridy = 0;
	        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
	        gbc.insets = new Insets(20, 20, 0, 0);
	        add(backButton, gbc);
	        
	        gbc.weighty = 0.5;
	        gbc.gridx = 2;
	        gbc.gridy = 0;
	        gbc.anchor = GridBagConstraints.PAGE_START;
	        gbc.insets = new Insets(100, 0, 0, 0); 
	        add(headPanel, gbc);
	        
	        gbc.weighty = 0.5;
	        gbc.gridx = 2;
	        gbc.gridy = 0;
	        gbc.anchor = GridBagConstraints.PAGE_START;
	        gbc.insets = new Insets(200, 0, 0, 0);
	        add(date, gbc);
	        
	        gbc.insets = new Insets(255, -300, 0, 0);
	        add(nameLabel, gbc);
	        
	        gbc.insets = new Insets(250, 0, 0, 0);
	        add(name, gbc);
	        
	        gbc.insets = new Insets(305, -300, 0, 0);
	        add(qtyLabel, gbc);
	        
	        gbc.insets = new Insets(300, 0, 0, 0);
	        add(qty, gbc);
	        
	        gbc.insets = new Insets(355, -300, 0, 0);
	        add(cIdLabel, gbc);
	        
	        gbc.insets = new Insets(350, 0, 0, 0);
	        add(cId, gbc);
	        
	        gbc.gridx = 3;
	        gbc.anchor = GridBagConstraints.PAGE_START;
	        gbc.insets = new Insets(400, 0, 0, 0);
	        add(submit, gbc);

	        setSize(450, 800);
	        setVisible(true);

	}
	
	private void insertData() {
		String name = name.getText();
		String qtyStr = qty.getText();
		String cIdStr = cId.getText();
		
	}
	
	public static void main(String[] args) {
		new Order_B1();
	}
}