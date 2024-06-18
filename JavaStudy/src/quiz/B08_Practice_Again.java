package quiz;
import java.util.Scanner;

public class B08_Practice_Again {
	
	/*
	  사용자가 어떤 문장을 입력하면 해당 문장을 거꾸로 출력해보세요
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력해 주세요 > ");
		String words = sc.nextLine();
		int len = words.length();
		
		for (int i = 0; i < len; i++) {
			System.out.print(words.charAt(len - 1 - i));
		}
		
	}

}
