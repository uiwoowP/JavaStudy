package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_11365 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String words = br.readLine();
			if (words.equals("END")) {
				break;
			}
			
			sb.append(words);
			bw.append(sb.reverse());
			bw.append('\n');
			sb.setLength(0);
			
		}
		bw.close();
		br.close();
		
	}
}
