package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_10871 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		int len = Integer.parseInt(input[0]);
		int num = Integer.parseInt(input[1]);
		
		int[] arr = new int[len];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < len; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] < num) {
				br.close();
				bw.write(arr[i] + " ");
			}
		}
		bw.flush();
		bw.close();
	}
}
