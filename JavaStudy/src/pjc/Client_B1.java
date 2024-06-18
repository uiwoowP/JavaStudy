package pjc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import database.DBConnector;

public class Client_B1 {

    static public void excuteUpdate(String name, String contact, String phone_number) {
        DBConnector connector = new DBConnector("HR", "1234");

        try (
                Connection conn = connector.getConnection();
        ) {
            String sql = "INSERT INTO supplier(supplier_name, contact, phone_number)"
                    + " VALUES (?, ?, ?)";
            try (
                PreparedStatement pstmt = conn.prepareStatement(sql);    
            ) {
                pstmt.setString(1, name);
                pstmt.setString(2, contact);
                pstmt.setString(3, phone_number);

                pstmt.executeUpdate();
            }
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static public void phone_number_fail() {
        JFrame frame = new JFrame();

        frame.setLayout(null);
        JLabel label = new JLabel("<html><body style=\"text-align:center;\">전화번호 등록실패"
                + "<br>['-' 제외한 11자리 숫자가 아닙니다]</body></html>");
        label.setSize(250, 60);
        label.setLocation(15, 20);
        label.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
        label.setForeground(Color.RED);

        frame.add(label);
        frame.setBounds(200, 425, 280, 150);
        frame.setVisible(true);
    }

    static public void blank_fail() {
        JFrame frame = new JFrame();

        frame.setLayout(null);
        JLabel label = new JLabel("<html><body style=\"text-align:center;\">등록실패"
                + "<br>[첫글자는 공백이 아니어야 합니다]</body></html>");
        label.setSize(250, 60);
        label.setLocation(15, 20);
        label.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
        label.setForeground(Color.RED);

        frame.add(label);
        frame.setBounds(200, 425, 280, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // 납품업체정보 등록

        JFrame frame = new JFrame();
        frame.setSize(400, 850);

        JButton back = new JButton();

        back.setSize(80, 40);
        back.setLocation(20, 20);
        back.setText("뒤로가기");
        back.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
        back.setMargin(new Insets(0, 0, 0, 0));

        JTextField textField = new JTextField("납품업체정보 등록");
        textField.setSize(200, 30);
        textField.setLocation(100, 100);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.CENTER);

        JLabel Supplier_name = new JLabel("납품업체명");
        Supplier_name.setBounds(30, 155, 100, 30);
        Supplier_name.setFont(new Font("나눔글꼴", Font.PLAIN, 16));

        JLabel Contact = new JLabel("담당자명");
        Contact.setBounds(30, 210, 100, 30);
        Contact.setFont(new Font("나눔글꼴", Font.PLAIN, 14));

        JLabel Phone_number = new JLabel("전화번호");
        Phone_number.setBounds(30, 260, 100, 30);
        Phone_number.setFont(new Font("나눔글꼴", Font.PLAIN, 14));

        JTextField SN_field = new JTextField();
        SN_field.setBounds(130, 160, 200, 30);

        JTextField Contact_field = new JTextField();
        Contact_field.setBounds(130, 210, 200, 30);

        JTextField Phone_number_field = new JTextField();
        Phone_number_field.setBounds(130, 260, 200, 30);

        // 등록하기 버튼
        JButton Regist = new JButton();

        Regist.setSize(80, 40);
        Regist.setLocation(250, 320);
        Regist.setText("등록하기");
        Regist.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
        Regist.setMargin(new Insets(0, 0, 0, 0));

        Regist.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if ( !Contact_field.getText().matches("^[^ ].*") ||
                        !Contact_field.getText().matches("^[^ ].*")) {
                    blank_fail();
                } else if (Phone_number_field.getText().length() != 11
                        && !Phone_number.getText().matches("[0-9]{11}")) {
                    phone_number_fail();
                } else {
                    excuteUpdate(SN_field.getText(), Contact_field.getText(), Phone_number_field.getText());
                }

            }
        });

        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(textField);

        frame.add(Supplier_name);
        frame.add(Contact);
        frame.add(Phone_number);

        frame.add(back);
        frame.add(Regist);

        frame.add(SN_field);
        frame.add(Contact_field);
        frame.add(Phone_number_field);
        frame.setVisible(true);

        // 뒤로 가기
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Client_A1 c_a1 = new Client_A1();
                c_a1.main(args);
                frame.setVisible(false);
            }
        });

    }
}

