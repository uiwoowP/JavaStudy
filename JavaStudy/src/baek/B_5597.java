package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class B_5597 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[30];
		
		for (int i = 0; i < arr.length - 2; ++i) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int i = 1;
		while (i < arr.length) {
			if (arr[i] - arr[i-1] == 1)
			{ continue; }
			else {
				System.out.println("Missing Number is " + (arr[i-1] + 1));
			}
			i++;
		}
	}
}
