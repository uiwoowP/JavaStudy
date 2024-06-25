package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_26068 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int output = n;
		
		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine(), "-");
			st.nextToken();
			int date = Integer.parseInt(st.nextToken());
			
			if (date > 90) {
				output--;
			}
		}
		System.out.println(output);
	}
}
