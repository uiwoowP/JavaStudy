package quiz;
import java.util.Scanner;

public class B07_GuessDigit_Answer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 보세요 > ");
		int num = sc.nextInt();
		
		System.out.println((int)Math.log10(num) + 1);
		
//		int cnt;
//		for (cnt = 0; num > 0; num /= 10) {
//			++cnt;
//		}
//		System.out.println(cnt + "자리 숫자입니다.");
		
//		int cnt = 0;
//		for (int compare = 10; compare <= 1000000000 && num < compare;
//				compare *= 10) {
//			++cnt;
//		}
//		
//		System.out.println(cnt + "자리 입니다");
		
	}
}
