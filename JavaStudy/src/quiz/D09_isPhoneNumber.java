package quiz;

import java.util.Scanner;

public class D09_isPhoneNumber {
	/*
	 
	 	사용자로부터 전달받은 문자열이 올바른 핸드폰 번호인지 검사하는 메서드를 만들어보세요
	 
	 */
	static boolean checkPn(String num) {
			String firstToken = num.substring(0, 3);
			num = num.replaceAll(" ", "");
			
			if (num.contains("-")) {
				String middleToken = num.substring(num.indexOf("-"), num.lastIndexOf("-"));
				if (middleToken.length() != 4) {
					return false;
				}
			}

			num = num.replaceAll("-", "");
			if (!firstToken.equals("010")) {
				return false;
			} else if (num.length() != 11) {
				System.out.println("번호의 길이가 다릅니다.");	
				return false;				
			}

			for (int i = 0; i < num.length(); ++i) {
				if (num.charAt(i) < '0' || num.charAt(i) > '9') {
					return false;
				}
			}
			
			return true;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("폰번호를 입력하세요 > ");
		System.out.println("이 번호는 적합한가요? " + checkPn(sc.nextLine()));
	}

}
