package quiz;
import java.util.Scanner;


public class B09_Numeric {
	
	/*
	 
	    사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
	    판별해주는 프로그램을 만들어보세요
	    
	 */
	 // '0' ~ '9' : 48 ~ 57
	
	
	public static void main(String[] args) {
		
		System.out.println("문자열을 입력해 주세요 > ");
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		boolean isNumber = false;
		int len = words.length();
		
		// &= 연산을 좀더 활용해서 기억하도록 해보기
		for (int i = 0; i < len; i++) {
			if (words.charAt(i) >= '0' && words.charAt(i) <= '9') {
				isNumber &= true;
				continue;
			} else {
				System.out.println("입력하신 문자열에 숫자 이외의 문자가 포함되어있습니다");
				isNumber &= false;
				break;
			}
			
		}
		
		if (isNumber) {
			System.out.println("입력하신 문자열은 전부 숫자입니다");
		}
		
		
		
	}

}
