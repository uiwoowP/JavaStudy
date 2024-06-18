package quiz;

import java.util.Arrays;

public class C00_FunctionQuiz2_Answer {
	
	// 공통되는 작업은 하나의 함수로 나누어서 여러곳에 활용하는 방법을 사용하는것이 좋다
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getRandomNumbers(0, 9, 7)));
		System.out.println(shuffle("Department Store"));
		System.out.println(reverse("OrangeRangeLevelseenkeen"));
		System.out.println(Arrays.toString(getLottoNumbers()));
		System.out.println(checkPalindrome("ABBA"));
		System.out.println(checkPalindrome("Abba"));
		System.out.println(checkPalindrome("Father"));
		System.out.println(checkPalindrome("MoM"));
		
	}
	
	// 1. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	
	// 0 ~ 6이 들어왔을때 중복없이 0 ~ 6 까지의 숫자를 랜덤으로 반환하는함수
	public static int[] getRandomNumbers(int start, int end, int size) {
		int[] arr = new int[size];
		
		int currIndex = 0;
		while (currIndex < size) {
			int num = (int)(Math.random() * (end - start + 1) + start);
			
			boolean repeated = false;
			for (int i = 0; i < currIndex; ++i) {
				if (arr[i] == num) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				// 배열주소 안에서 ++사용가능
				arr[currIndex++] = num;
			}
		}
		return arr;
	}
	
	public static String shuffle(String text) {
		int len = text.length();
		
		// (1) 문자열 길이를 활용해 중복없는 랜덤 인덱스 배열을 먼저 생성한다
		//	   ex> 길이가 10일때 0 ~ 9의 중복없는 랜덤 배열을 생성한다
		int[] ranNums = getRandomNumbers(0, len - 1, len);
		
		// (2) 생성된 배열을 활용해 문자열을 섞어서 출력한다
		String shuffled = "";
		
		for (int i = 0; i < ranNums.length; ++i) {
			shuffled += text.charAt(ranNums[i]);
		}
		return shuffled;
	}
	
	// 2.
	public static String reverse(String text) {
		int len = text.length();
		String reversed = "";
		for (int i = len - 1; i >= 0; --i) {
			reversed += text.charAt(i);
		}
		return reversed;
	}
	
	// 3.
	// 문자열은 비교할때 equals를 사용해야한다. 
	public static boolean checkPalindrome(String text) {
		return text.equals(reverse(text));
	}
	
	// 4.
	public static int[] getLottoNumbers() {
		return getRandomNumbers(1, 45, 7);
	}

}
