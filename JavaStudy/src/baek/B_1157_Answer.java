package baek;

import java.io.IOException;

public class B_1157_Answer {
	public static void main(String[] args) throws IOException {
		
		int[] arr = new int[26];
		
		int n = System.in.read();
		
		while (n > 64) {
			
			if (n < 91) {
				arr[n - 65]++;
			} else {
				arr[n - 97]++;
			}
			
			n = System.in.read();
		}
		
		int max = -1;
		int ch = -2;
		
		for (int i = 0; i < 26; ++i) {
			
			if (arr[i] > max) {
				max = arr[i];
				ch = i;
			} else if (arr[i] == max) {
				ch = -2;
			}
		}
		System.out.print((char) (ch+65));
	}
}
