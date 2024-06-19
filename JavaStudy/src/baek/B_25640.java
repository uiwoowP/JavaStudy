package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_25640 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String j = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for (int i = 0; i < n; ++i) {
			String word = br.readLine();
			
			if (word.equals(j)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
