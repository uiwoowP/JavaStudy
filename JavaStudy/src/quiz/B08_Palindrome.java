package quiz;
import java.util.Scanner;

public class B08_Palindrome {
	
	/*
	  
	   사용자가 단어를 입력하면
	   해당 단어가 좌우대칭을 이루는 단어인지 판별해주는 프로그램을 만들어 보세요
	   
	   >> LEVEL
	   -> 좌우대칭입니다.
	   
	   >> Apple
	   -> 좌우대칭이 아닙니다.
	   
	   >> BOB
	   -> 좌우대칭입니다.
	   
	   >> ABBA
	   -> 좌우대칭입니다.
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력해 주세요 > ");
		String word = sc.next().toLowerCase();
		int len = word.length();
		String wordR;

		
		for (int i = 0; i < len; i++) {
			System.out.println(word.charAt(i));
		}
		
		
	}
}
