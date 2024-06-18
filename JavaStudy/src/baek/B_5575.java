package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_5575 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < 3; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			
			int hour = (d - a);
			int minutes = (e - b);
			int second = (f - c);
			
			if (second < 0) {
				second = 60 + second;
				minutes--;
			} 
			if (minutes < 0) {
				minutes = 60 + minutes;
				hour--;
			}
			
			bw.write(hour + " " + minutes + " " + second + '\n');
		}
		bw.close();
		br.close();
	}
}
