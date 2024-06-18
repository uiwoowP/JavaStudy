package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B_10988 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		boolean palindrome = true;
		
		for (int i = 0; i < word.length() / 2; ++i) {
			
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(word.length() - 1 - i);
			
			if (ch1 != ch2) {
				palindrome = false;
			}
		}
		if (palindrome) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
