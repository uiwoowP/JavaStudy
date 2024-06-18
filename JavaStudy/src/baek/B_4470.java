package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_4470 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int line = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < line; ++i) {
			String sentence = br.readLine();
			sb.append(i + 1 + ". ").append(sentence).append('\n');
		}
		System.out.println(sb);
		
	}
}
