package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_25600 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int score = 0;
		for(int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			
			int temp;
			if (a == d + g) {
				temp = (a * (d + g)) * 2;
			} else {
				temp = a * (d + g);				
			}
			
			if (score < temp) {
				score = temp;
			}
		}
		System.out.println(score);
	}
}
