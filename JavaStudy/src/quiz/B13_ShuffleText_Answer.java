package quiz;
import java.util.Scanner;

public class B13_ShuffleText_Answer {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// "Hello" -> {'H', 'e', 'l', 'l', 'o'}
		String text = sc.nextLine();
		
		String spaceRemoved = "";
		
		int len = text.length();
		for (int i = 0; i < text.length(); ++i) {
			char ch = text.charAt(i);
			if (ch != ' ') {
				spaceRemoved += ch;
			}
		}
		
		// text.length()개 크기의 배열을 생성
		// 빈배열 0 null false 
		char[] arr = new char[spaceRemoved.length()];
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = spaceRemoved.charAt(i);
		}
		
		// 섞기 (랜덤한 위치를 뽑으려 하면 같은 위치가 자꾸 걸려서 문제가 된다)
//		for (int i = 0; i < arr.length; ++i) {
//			arr[i] = arr[(int)(Math.random() * arr.length)];
//		}
//		System.out.println(arr);
		
		// 화투처럼 섞기 (0번 위치와 랜덤 위치의 값을 1000번 교환한다)
		for (int i = 0; i < 1000; ++i) {
			// 랜덤 위치는 1부터 len - 1까지 나와야 한다
			int randomIndex = (int)(Math.random() * (arr.length - 1)  + 1);
			
			char temp = arr[0];
			arr[0] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
		System.out.println(arr);
	}

}
