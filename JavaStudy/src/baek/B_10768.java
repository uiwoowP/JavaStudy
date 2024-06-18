package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10768 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int mon = Integer.parseInt(br.readLine());
		int day = Integer.parseInt(br.readLine());
		
		if (mon < 2) {
			System.out.println("Before");
		} else if (mon == 2) {
			if (day < 18) {
				System.out.println("Before");
			} else if (day > 18) {
				System.out.println("After");
			} else {
				System.out.println("Special");
			}
		} else {
			System.out.println("After");
		}
	}
}
