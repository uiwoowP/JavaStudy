package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_16199 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int bYear = Integer.parseInt(st.nextToken());
		int bMon = Integer.parseInt(st.nextToken());
		int bDay = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int tYear = Integer.parseInt(st.nextToken());
		int tMon = Integer.parseInt(st.nextToken());
		int tDay = Integer.parseInt(st.nextToken());
		
		int age = tYear - bYear;
		
		if (bYear == tYear) {
			System.out.println(age);
		} else {
			if (bMon > tMon) {
				System.out.println(age - 1);
			}
			else if (bMon == tMon) {
				if (bDay <= tDay) {
					System.out.println(age);
				} else {
					System.out.println(age - 1);
				}
				
			} else {
				System.out.println(age);
			}
			
		}
		System.out.println(age + 1);
		System.out.println(age);
	}
}
