package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_10810 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int m = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < m; ++i) {
			st = new StringTokenizer(br.readLine());
			
			int q = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			for (int r = q - 1; r < w;  ++r) {
				arr[r] = e;
			}
		}
		for (int t = 0; t < arr.length; ++t) {
			bw.write(arr[t] + " ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
