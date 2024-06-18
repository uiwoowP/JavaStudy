package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1316 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prv = 0;
		String word = br.readLine();
		
		for (int i = 0; i < word.length(); ++i) {
			int now = word.charAt(i);
			
			if (prv != now) {
				if (!check[now - 'a']) {
					check[now - 'a'] = true;
					prv = now;
				} else {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < n; ++i) {
			if (check()) {
				++cnt;
			}
		}
		System.out.println(cnt);
	}
}
