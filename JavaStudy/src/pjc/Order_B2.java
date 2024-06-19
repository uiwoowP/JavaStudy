package pjc;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import database.DBConnector;

public class Order_B2 extends JFrame {
	
	boolean isShow = true;
	boolean isNoData = false;
	static Font font = new Font("나눔글꼴", Font.PLAIN, 14);
	DBConnector connector = new DBConnector("HR", "1234");
	
	
	Order_B2() {
		setTitle("Order_B2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		JButton backButton = new JButton("뒤로가기");
		backButton.setFont(font);
		backButton.setSize(new Dimension(80, 40));
		
		JPanel tablePanel = new JPanel();
		
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(20, 20, 0, 0);
        add(backButton, gbc);
		
		setSize(450, 800);
		setVisible(isShow);
		
	}
	
	private List<Object[]> getTable() {
		String sql = "SELECT * FROM order_table";
		List<Object[]> list = new ArrayList<>();
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
				) {
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			while (rs.next()) {
				Object[] row = new Object[columnCount];
				for (int i = 0; i < columnCount; ++i) {
					row[i] = rs.getObject(i + 1);
				}
				
				list.add(row);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			isNoData = true;
		}
		return list;
	}
	
	public static void main(String[] args) {
		new Order_B2();
		
	}
}
