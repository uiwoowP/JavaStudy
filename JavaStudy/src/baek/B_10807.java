package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_10807 {
	
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int checkNum = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i < num; ++i) {	
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] == checkNum) {
				++cnt;
			}
		}
		br.close();
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}
}
