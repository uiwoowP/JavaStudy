package quiz;
import java.util.Scanner;

public class B08_PrintReverse_Answer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		// 마지막 인덱스부터 0까지 반복하며 한 글자씩 출력하기
		for (int i = text.length() - 1; i >= 0; --i) {
			System.out.print(text.charAt(i));
		}
		
		// 마지막 인덱스에서 1씩 더 빼면서 한 글자씩 출력하기
		int len = text.length();
		for (int i = 0; i < len; ++i) {
			System.out.print(text.charAt(len - 1 - i));
		}
		System.out.println();
		
	}

}
