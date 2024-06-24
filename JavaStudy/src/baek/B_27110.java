package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_27110 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int chicken = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int fried = Integer.parseInt(st.nextToken());
		int soy = Integer.parseInt(st.nextToken());
		int yang = Integer.parseInt(st.nextToken());
		
		int output = 0;
		output += Math.min(chicken, fried);
		output += Math.min(chicken, soy);
		output += Math.min(chicken, yang);
		
		System.out.println(output);
		
	}

}
