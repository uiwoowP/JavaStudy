package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_25591 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		int a = 100 - n1;
		int b = 100 - n2;
		int c = 100 - (a + b);
		int d = a * b;
		int q = d / 100;
		int r = d % 100;
		
		bw.write(String.valueOf(a) + " " + String.valueOf(b) 
		+ " " + String.valueOf(c) + " " + String.valueOf(d) + " " 
		+ String.valueOf(q) + " " + String.valueOf(r) + "\n");
		bw.write(String.valueOf(c + q) + " " + String.valueOf(r));
		
		bw.close();
		br.close();
		
	}
}
