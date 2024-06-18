package pjc;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Dashboard {
	
	JFrame f;
	JTable j;
	
	Dashboard() {
		
		f = new JFrame();
		
		f.setTitle("데이터프레임 대시보드 예시");
		
		String[][] data = {
				{"0", "가구1", "10", "3"},
				{"1", "가구2", "20", "4"}
		};
		
		String[] columnNames = {"재고SEQ", "이름", "수량", "무게"};
		
		j = new JTable(data, columnNames);
		j.setBounds(30, 40, 200, 300);
		
		JScrollPane sp = new JScrollPane(j);
		f.add(sp);
		f.setSize(1280, 960);
		f.setVisible(true);
		
	};
	
	public static void main(String[] args) {
		HikariConfig config = new HikariConfig();
		
		config.setJdbcUrl("jdbc:oracle:thin:@127.0.0.1:1521:XE");
		config.setUsername("HR");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		
		HikariDataSource ds = new HikariDataSource(config);
		
		new Dashboard();
		
	}
	
}
