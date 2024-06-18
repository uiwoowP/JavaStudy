package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_25372 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; ++i) {
			String pwd = br.readLine();
			
			if (pwd.length() >= 6 && pwd.length() <= 9) {
				bw.write("yes" + '\n');
			} else {
				bw.write("no" + '\n');
			}
		}
		bw.close();
		br.close();
	}
}
