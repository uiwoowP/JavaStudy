package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_5596 {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int total1 = a + b + c + d;
		
		st = new StringTokenizer(br.readLine());
		
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int total2 = e + f + g + h;

		if (total1 > total2) {
			System.out.println(total1);
		} else if (total1 < total2) {
			System.out.println(total2);
		} else if (total1 == total2) {
			System.out.println(total2);
		}
		
	}
}
