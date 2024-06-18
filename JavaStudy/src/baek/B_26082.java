package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_26082 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int price = Integer.parseInt(st.nextToken());
		int power = Integer.parseInt(st.nextToken());
		int warBoy = Integer.parseInt(st.nextToken());
		
		System.out.println(((power / price) * 3) * warBoy);
		
	}
}
