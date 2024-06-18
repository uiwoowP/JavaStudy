package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_16486 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double d1 = Double.parseDouble(br.readLine());
		double d2 = Double.parseDouble(br.readLine());
		
		double result = (2 * d1) + (2 * d2 * 3.141592);
		System.out.println(result);
		
	}
}
