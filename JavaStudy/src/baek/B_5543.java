package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5543 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		if (a <= b && a <= c) {
			if (d < e) {
				System.out.println((a + d) - 50);
			} else {
				System.out.println((a + e) - 50);
			}
		} else if (b <= a && b <= c) {
			if (d < e) {
				System.out.println((b + d) - 50);
			} else {
				System.out.println((b + e) - 50);
			}
		} else if (c <= a && c <= b) {
			if (d < e) {
				System.out.println((c + d) - 50);
			} else {
				System.out.println((c + e) - 50);
			}
		}
	}
}
