package quiz;

import java.util.Arrays;

public class C00_FunctionQuiz2 {
	
	/*
	 
	 	1. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	 	
	 	2. 문자열을 전달하면 해당 문자열을 거꾸로 뒤집은 문자열을 반환하는 함수
	 	
	 	3. 문자열을 전달하면 해당 문자열의 좌우대칭 여부를 반환하는 함수
	 	
	 	4. 함수를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	 
	 */
	
	// 1.
	public static String randStr (String str) {
		String output = "";
		
		for (int i = 0; i < str.length(); ++i) {
			int randIndex = (int)((Math.random() * str.length() - 1) + 1);
			output += str.charAt(randIndex);	
		}
		return output;
	}
	
	// 2.
	public static String revStr (String str) {
		String output = "";
		int cnt = str.length();
		for (int i = 0; i < str.length(); ++i) {
			output += str.charAt(cnt - 1);
			--cnt;
		}
			return output;
	}
	
	// 3.
	public static boolean pellStr (String str) {
		int len = str.length();
		int half = len / 2;
		boolean pell = false;
		
		for (int i = 0; i < half; ++i) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(len - 1 - i);
			
			if (ch1 != ch2) {
				pell = false;
			}
			else {
				pell = true;
			}
		}
		return pell;
	}
	
	public static int[] randArr() {
		int[] arr = new int[7];
		int index = 0;
		while (index < arr.length) {
			int num = (int)((Math.random() * 45) + 1);
			boolean repeated = false;
			for (int i = 0; i < index; ++i) {
				if (arr[i] == num) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				arr[index] = num;
				++index;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		
		System.out.println("1." + randStr("HappyDays!"));
		System.out.println("2." + revStr("LovelyDays!"));
		System.out.println("3." + pellStr("LEVEL"));
		System.out.println("4." + Arrays.toString(randArr()));
	}
}
