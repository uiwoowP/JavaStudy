package baek;

import java.util.Scanner;

public class B_2739 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= 9; ++i) {
			int x = n * i;
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		
	}
}
