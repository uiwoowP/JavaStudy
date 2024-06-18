package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_NumbersOnly {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("> ");
				int num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요!!");
				sc.next();
			}
		}
		System.out.println("프로그램이 정상 종료되었습니다...");
	}

}
