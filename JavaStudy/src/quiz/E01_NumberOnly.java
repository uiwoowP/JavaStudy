package quiz;

import java.util.Scanner;

public class E01_NumberOnly {
	
	/*
	 
	 	사용자로부터 스캐너의 nextInt()로 숫자를 입력받되, 숫자가 아닌것을 입력하더라도
	 	프로그램이 강제종료되지 않고 다시 입력받을 수 있게 만들어보세요	 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("아무거나 입력하세요 > ");
				int num = sc.nextInt();
				System.out.println("입력된 숫자 [" + num + "]");
				if (num == 0) {
					break;
				}

			} catch (Exception e) {
				System.out.println("사실 숫자를 입력해주길 바랍니다!");
				System.out.println("종료하려면 0을 입력하세요");
				sc.next();

			}
			
		}
	}
}