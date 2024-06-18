package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10987 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		char[] chs = word.toCharArray();
		
		int cnt = 0;
		for (int i = 0; i < chs.length; ++i) {
			
			if (chs[i] == 'a' || chs[i] == 'e' || 
					chs[i] == 'i' || chs[i] == 'o' || chs[i] == 'u') {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}
