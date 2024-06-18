package pjc;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Client_A1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JButton back = new JButton();
		
		back.setSize(80, 40);
		back.setLocation(20, 20);
		back.setText("뒤로가기");
		back.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
		back.setMargin(new Insets(0, 0, 0, 0));
	
		
		JButton a1 = new JButton();
		
		a1.setSize(200, 50);
		a1.setLocation(100, 200);
		a1.setText("납품업체정보 등록");
		a1.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
		
		
		JButton a2 = new JButton();
		
		a2.setSize(200, 50);
		a2.setLocation(100, 300);
		a2.setText("납품업체정보 수정");
		a2.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
		
		
		frame.setLayout(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(a1);
		frame.add(a2);
		
		frame.add(back);
		frame.setSize(400, 850);
		frame.setVisible(true);
		
		// 뒤로 가기
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			// MAIN-A2 이동
			frame.setVisible(false);
			}
		});
		
		// 납품업체정보 수정 이동
		a1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// DELIVERY-B2 호출
				frame.setVisible(false);
				Client_B1 b1 = new Client_B1();
				b1.main(args);
			}
		});
		
		// 납품업체정보 수정 이동
		a2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// DELIVERY-B1 호출
				frame.setVisible(false);
			}
		});
		
		
		
	}
}
