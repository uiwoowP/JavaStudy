package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_10808 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String word = br.readLine();
		word = word.toLowerCase();
		char[] chs = word.toCharArray();
		int[] arr = new int[26];
		
		for (int i = 0; i < chs.length; ++i) {
			arr[(int)chs[i] - 97]++;
		}
		
		for (int i = 0; i < arr.length; ++i) {
			sb.append(Integer.toString(arr[i]));
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		bw.append(sb);
		bw.close();
		br.close();	
	}
}
