package quiz;
import java.util.Scanner;

public class B13_ShuffleText {
	
	/*
	 	사용자로부터 문장을 입력받으면
	 	해당 문장의 순서를 랜덤으로 뒤섞은 결과를 만들어낸 후 출력해보세요
	 	(문장 내에 공백이 포함되어 있으면 제거할 것)
	 	
	 	ex 오늘 나는 지하철을 타고 왔다 -> 다고지타왔오나는늘
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		String word = "";
		
		for (int i = 0; i < words.length(); ++i) {
			char ch = words.charAt(i);
			
			if (ch == ' ') {
				continue;
			} else {
				word += ch;
			}
		}
		System.out.println(word);
		
		for (int i = 0; i < words.length(); ++i) {
		}
		
		
	}
}
