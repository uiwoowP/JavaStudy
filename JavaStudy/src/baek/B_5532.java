package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5532 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		while (true) {
			if(a % c == 0) {
				a = a / c;
			} else {
				a = a / c;
				a++;
			}
			
			if (b % d == 0) {
				b = b / d;
			} else {
				b = b / d;
				b++;
			}
			
			if (a > b) {
				System.out.println(l - a);
				break;
			} else {
				System.out.println(l - b);
				break;
			}
		}
	}
}
