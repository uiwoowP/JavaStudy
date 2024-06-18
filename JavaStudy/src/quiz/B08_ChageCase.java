package quiz;
import java.util.Scanner;

public class B08_ChageCase {
	
	/*
	 
	   사용자가 영어로 된 문장을 입력하면 대소문자를
	   반대로 바꿔서 출력해주는 프로그램을 만들어보세요
	   
	   ex> I Like To Try Apple
	   
	   ※ 입력에 공백 또는 영어가 아닌 문자가 포함되어 있다면 메세지를 출력
	   
	   입력> 한글
	   출력> 이 프로그램에는 영어와 공백만 입력하실 수 있습니다.
	   
	   // A - Z  == 65 ~ 90
	   // a - z  == 97 ~ 122
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 문장을 입력해 주세요 > ");
		String words = sc.nextLine();
		String output = "";
		int len = words.length();

		for (int i = 0; i < len; i++) {
			if (words.charAt(i) >= 64 && words.charAt(i) <= 90) {
				output += words.toLowerCase().charAt(i);
			} else if (words.charAt(i) >= 97 && words.charAt(i) <= 122) {
				output += words.toUpperCase().charAt(i);
			} else {
				output += words.charAt(i);
			}
		}
		
		System.out.print(output);
	}
}
