package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_27294 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int time = Integer.parseInt(st.nextToken());
		int drink = Integer.parseInt(st.nextToken());
		
		if (time >= 12 && time <= 16 && drink == 0) {
			System.out.println(320);
		} else if (time >= 12 && time <= 16 && drink == 1) {
			System.out.println(280);
		} else {
			System.out.println(280);
		}
	}
}
