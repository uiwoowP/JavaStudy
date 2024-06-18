package quiz;

public class C00_FuntionQuiz {
	
	/*	 
	 	# 다음 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	
	 	  1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 	  2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	  3. 숫자 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 	  4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	 	  5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 	  6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하는 함수
	 	  
	 */
	
	// 1. 반환값이 true or false 일때 삼항연산자 사용 필요 x 
	public static boolean isAlphabet(char word) {
		return ((word >= 'A' && word <= 'Z') || ( word >= 'a' && word <= 'z')) ? true : false;
	}
	
	// 2. 반환값이 true or false 일때 삼항연산자 사용 필요 x 
	public static boolean isBaesu(int num) {
		return num % 3 == 0 ? true : false;
	}
	
	// 3.
	public static String oddEven(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	// 4.
	public static int[] yaksu(int num) {
		int[] arr = new int[8];
		
		int cnt = 0;
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				arr[cnt] = i;
				++cnt;
			}
		}
		
		return arr;
	}
	
	// 5.
	public static boolean isPrime(int num) {
		return num % 2 == 0 ? false : true;
	}
	
	// 6.
	public static void message(String str, int num) {
		for(int i = 0; i < num; ++i) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("1." + isAlphabet('f'));
		System.out.println("1." + isAlphabet('1'));
		System.out.println("2." + isBaesu(33));
		System.out.println("2." + isBaesu(10));
		System.out.println("3." + oddEven(3));
		System.out.println("3." + oddEven(4));
		
		int arr[] = yaksu(30);
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("5." + isPrime(3));
		System.out.println("5." + isPrime(5));
		System.out.println("5." + isPrime(11));
		message("6." + "Hello world!", 5);
		
	}

}
