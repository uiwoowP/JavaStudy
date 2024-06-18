package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class B_4999 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String jae = br.readLine();
		String doc = br.readLine();
		
		br.close();
		
		if (jae.length() >= doc.length()) {
			sb.append("go");
		} else {
			sb.append("no");
		}
		bw.append(sb);
		bw.close();
	}
}
