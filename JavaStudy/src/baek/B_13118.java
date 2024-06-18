package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_13118 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[4];
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		
		boolean crash = false;
		for (int i = 0; i < 4; ++i) {
			if (arr[i] == x) {
				System.out.println(i + 1);
				crash = true;
			}
		}
		
		if (!crash) {
			System.out.println(0);
		}
	}
}
