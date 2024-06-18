package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10797 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		
		int a = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] == a) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
