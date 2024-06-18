package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_2562 {   
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		for (int i = 0; i < 9; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();		
		int max = Arrays.stream(arr).max().getAsInt();
		int idx = Arrays.binarySearch(arr, max);
		bw.write(Integer.toString(max));
		bw.write("\n");
		bw.write(Integer.toString(idx + 1));
		bw.flush();
		bw.close();
	}
}
