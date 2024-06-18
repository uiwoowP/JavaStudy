package quiz;

public class B08_Palindrome_Answer {
	
	public static void main(String[] args) {
		
		String word = "LeeveeL";
		
		int len = word.length();
		int half = len / 2;
		
		// 좌우대칭 여부를 저장해놓을 변수
		boolean isPalindrome = true;
		
		for (int i = 0 ; i < half; ++i) {
//			System.out.printf("%c vs %c\n", 
//					word.charAt(i), word.charAt(len - 1 - i));
			
			// i   ch1    ch2
			// ----------------
			// 0   0     len - 1 - 0
			// 1   1     len - 2
			// 2   2     len - 3
			//
			
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(len - 1 - i);
			
			// 한 번이라도 좌우대칭이 아닐 때 값이 다시 변하지 않도록 불리언변수 안에 값을 고정
			if (ch1 != ch2) {
				isPalindrome = false;
			} 
		}
		
		if (isPalindrome) {
			System.out.println("\"" + word + "\"좌우대칭 입니다.");
		} else {
			System.out.println("\"" + word + "\"좌우대칭이 아닙니다.");
		}
		
	}

}
