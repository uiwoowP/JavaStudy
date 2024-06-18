package pjc;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Product_A1 {
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
        a1.setText("상품 목록 조회/수정");
        a1.setFont(new Font("나눔글꼴", Font.PLAIN, 14));


        JButton a2 = new JButton();

        a2.setSize(200, 50);
        a2.setLocation(100, 300);
        a2.setText("상품 이동");
        a2.setFont(new Font("나눔글꼴", Font.PLAIN, 14));

        JButton a3 = new JButton();

        a3.setSize(200, 50);
        a3.setLocation(100, 400);
        a3.setText("검수 / 입고");
        a3.setFont(new Font("나눔글꼴", Font.PLAIN, 14));


        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(a1);
        frame.add(a2);
        frame.add(a3);

        frame.add(back);
        frame.setSize(400, 850);
        frame.setVisible(true);

        // 뒤로가기 버튼
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            // Main_A2 호출
            frame.setVisible(false);
            }
        });

        // 상품 목록 조회/이동
        a1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // product_B1 호출
                frame.setVisible(false);
            }
        });

        // 상품 이름 이동
        a2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // product_B3 호출
                frame.setVisible(false);
            }
        });

        // 검수/입고 이동
        a3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // product_B4 호출
                frame.setVisible(false);
            }
        });



    }
}