package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_3003 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		int[] arr = new int [6];
		
		for (int i = 0; i < chess.length; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] <= chess[i]) {
				arr[i] = chess[i] - arr[i];
			} else if (arr[i] > chess[i]) {
				arr[i] = chess[i] - arr[i];
			}
			bw.write(Integer.toString(arr[i]) + " ");
		}
		br.close();
		bw.close();
	}
}
