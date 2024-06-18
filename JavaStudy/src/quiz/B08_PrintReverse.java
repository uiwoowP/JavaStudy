package quiz;
import java.util.Scanner;

public class B08_PrintReverse {
	
	/*
	  사용자가 어떤 문장을 입력하면 해당 문장을 거꾸로 출력해보세요
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력해 주세요");
		String words = sc.nextLine().toLowerCase();
		int len = words.length();
		
		for (int i = 0; i < 1; i++) {
			
			if (words.charAt(i) == words.charAt(len - 1 - i)) {
				System.out.println("좌우대칭입니다.");
			} else {
				System.out.println("좌우대칭이 아닙니다.");
			}
			
		}
		
		

	}
}
