package quiz;

import java.util.Scanner;

public class B09_Numeric_Answer {
	
	/*
	  &= 연산으로 누적시키면 한번이라도 false가 되면 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무거나 입력 >> ");
		String text = sc.nextLine();
		int len = text.length();
		
		boolean onlyNum = true;
		
		// (1) 모든 문자가 숫자인지 검사하는 방식.
	    //     검사를 문자열 길이만큼 해야 한다.
		// &= 연산으로 boolean값을 최소화 하는 방법을 항상 고려해 보면서 작성.
		for (int i = 0; i < len; ++i) {
//			char ch = text.charAt(i);
//			onlyNum &= (ch >= '0' && ch <= '9');
		}
		System.out.println("숫자만으로 이루어져 있나요? " + onlyNum);
		
		
		// (2) 숫자가 아닌 문자가 등장하면 바로 검사를 중단하는 방식
		//     (불필요한 검사를 줄일 수 있다)
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			
			if (ch < '0' || ch > '9') {
				onlyNum = false;
				break;
			}
		}
		
		System.out.println("숫자만 있나요? " + onlyNum);
		
	}

}
