package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_4299 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if ((a+b) % 2 != 0 || a < b) {
			System.out.println(-1);
		} else {
			System.out.println(((a + b) / 2) + " " + (((a + b) / 2) - b));
		}
		
	}

}
