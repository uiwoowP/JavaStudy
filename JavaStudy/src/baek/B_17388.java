package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_17388 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int total = s + k + h;
		
		if (total >= 100) {
			System.out.println("OK");
		} else {
			if (s < k && s < h) {
				System.out.println("Soongsil");
			} else if (k < s && k < h) {
				System.out.println("Korea");
			} else if (h < s && h < k) {
				System.out.println("Hanyang");
			}
		}
	}
}
