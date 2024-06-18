package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_13752 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; ++i) {
			int h = Integer.parseInt(br.readLine());
			
			for (int j = 0; j < h; ++j) {
				sb.append('=');
			}
			
			sb.append('\n');
		}
		System.out.println(sb);
		br.close();
		
	}

}
