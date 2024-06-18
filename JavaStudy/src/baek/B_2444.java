package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2444 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		final int num = Integer.parseInt(br.readLine());
		char ast = '*';
		for (int i = 1; i <= num; ++i) {
			for (int j = 0; j < num - i; ++j) {
				bw.write(' ');
			}
			
			for (int k = 0; k < i * 2 - 1; ++k) {
				bw.write('*');
			}
			bw.newLine();
		}
		
		for (int i = num - 1; i >= 0; --i) {
			for (int j = 0; j < num - i; ++j) {
				bw.write(' ');
			}
			for (int k = 0; k < i * 2 - 1; ++k) {
				bw.write('*');
			}
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
