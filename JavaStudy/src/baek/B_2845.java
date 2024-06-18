package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int person = Integer.parseInt(st.nextToken());
		int space = Integer.parseInt(st.nextToken());
		
		int people = person * space;
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < 5; ++i) {
			int num = Integer.parseInt(st2.nextToken());
			sb.append(num - people + " ");
		}
		System.out.println(sb);
	}
}
