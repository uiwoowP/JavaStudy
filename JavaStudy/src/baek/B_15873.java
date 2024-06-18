package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_15873 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nums = br.readLine();
		
		if (nums.charAt(1) == '0') {
			System.out.println(10 + Integer.parseInt(nums.substring(2)));
			
		} else {
			System.out.println(Character.getNumericValue(nums.charAt(0))
					+ Integer.parseInt(nums.substring(1)));
		}
	}
}
