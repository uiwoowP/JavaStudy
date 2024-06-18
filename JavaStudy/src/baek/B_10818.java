package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_10818 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		bw.write(Integer.toString(Arrays.stream(arr).min().getAsInt()));
		bw.write(" ");
		bw.write(Integer.toString(Arrays.stream(arr).max().getAsInt()));
		bw.flush();
		bw.close();
	}
}
