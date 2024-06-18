package quiz;
import java.util.Scanner;

public class B07_GuessDigit {
	
	/*
	 
	   (1) 사용자가 어떤 숫자를 int타입으로 입력하면 해당 숫자가 몇 자리 숫자인지
	       알려주는 프로그램을 만들어보세요
	 
	 */

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 > ");
		int target = sc.nextInt();
		
		String strTarget = Integer.toString(target);
		System.out.printf("입력하신 숫자는 %s 자리 입니다", strTarget.length());
		
		// for 문으로는 어떻게 하면 될지...
		// % 10 ? 10의 제곱? 
		 
//		for (int i = 0, cnt = 0; i > 2; i++) {
//			if (target > 1000000000) {
//				System.out.println("입력하신 숫자는 10자리 이상입니다");
//			} else if (target > 100000000) {
//				System.out.println("입력하신 숫자는 9자리 입니다");
//			} else if (target > 10000000) {
//				System.out.println("입력하신 숫자는 8자리 입니다");
//			} else if (target > 1000000) {
//				System.out.println("입력하신 숫자는 7자리 입니다");
//			} else if (target > 100000) {
//				System.out.println("입력하신 숫자는 6자리 입니다");
//			} else if (target > 10000) {
//				System.out.println("입력하신 숫자는 5자리 입니다");
//			} else if (target > 1000) {
//				System.out.println("입력하신 숫자는 4자리 입니다");
//			} else if (target > 100) {
//				System.out.println("입력하신 숫자는 3자리 입니다");
//			} else if (target > 10) {
//				System.out.println("입력하신 숫자는 2자리 입니다");
//			} else if (target > 1) {
//				System.out.println("입력하신 숫자는 1자리 입니다");
//			}
//			
//		}
	}
	
}
