package quiz;

import java.util.Arrays;

public class C00_FuntionQuiz_Answer {
	
	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean isAlphabet(char ch) {
		return (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');

	}

	// 2.
	public static boolean isMul3(int num) {
		return num % 3 == 0;
	}
	
	// 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반화하는 함수
	public static String checkEvenOdd(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	// 4. 숫자를 전다랗면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	public static int[] getYaksuList(int num) {
		int[] yaksuArr = new int[num];
		
		// num : 전달 받은 숫자
		// div : 전달 받은 숫자를 나눠볼 숫자
		int index = 0;
		for (int div = 1; div <= num; ++div) {
			if (num % div == 0) {
				// ++이 뒤에 들어갔으므로 대입을 하고 난 후 index가 증가한다
				yaksuArr[index++] = div;
			}
		}
		return Arrays.copyOf(yaksuArr, index);
	}
	
	// 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	// 함수를 return타입으로 전달하는 것이 가능. 
	public static boolean isPrime(int num) {
		return getYaksuList(num).length == 2;
	}
	
	// 6.
	
	public static void printMessage(String message, int times) {
		for (int i = 0; i < times; ++i) {
			System.out.println(message);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isAlphabet('김'));
		System.out.println(isAlphabet('L'));
		System.out.println(checkEvenOdd(123));
		System.out.println(checkEvenOdd('이'));
		System.out.println(Arrays.toString(getYaksuList(13)));
		System.out.println(isPrime(9));
		System.out.println(isPrime(11));
		
		printMessage(" /)/)\n( ..)", 10);
		
	}

}
