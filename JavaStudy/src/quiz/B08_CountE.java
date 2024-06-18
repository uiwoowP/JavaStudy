package quiz;
import java.util.Scanner;

public class B08_CountE {
	
	/*
	   사용자가 문장을 입력하면 해당 문장에 포함된 알파벳 e의 개수를 출력
	   (※ 대/소문자 모두 개수에 포함) 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 단어를 입력해 주세요 >");
		String word = sc.nextLine().toLowerCase();
		String wordTrim = word.replaceAll(" ", "");
		int wordLength = wordTrim.length();
		int numE = 0;
		
		System.out.println(wordTrim);
		
		for (int i = 0; i < wordLength; i++) {
			if (wordTrim.charAt(i) == 'e') {
				numE++;
			}
		}
		System.out.printf("포함되어 있는 e의 갯수는 %d개 입니다.", numE);
	}
}
