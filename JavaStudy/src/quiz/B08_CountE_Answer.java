package quiz;
import java.util.Scanner;

public class B08_CountE_Answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력해보세요 >> ");
		String text = sc.nextLine();
		
		// 0부터 입력한 문장의 길이 -1까지 i를 반복
		int count = 0;
		int len = text.length();
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			if (ch == 'e' || ch == 'E') {
				++count;
			}
		}
		System.out.println("e 또는 E가 나온 횟수: " + count);
		
	}
	
}
