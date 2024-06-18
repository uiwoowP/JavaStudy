package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B_2562_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int [] arr = new int[9];
		int cnt = 0;
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		int max = Arrays.stream(arr).max().getAsInt();
		
		for(int i = 0; i < 9; i++) {
			if (arr[i] == max) {
				cnt = i + 1;
			}
		}
		bw.write(Integer.toString(max));
		bw.write('\n');
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}
}
	
		
