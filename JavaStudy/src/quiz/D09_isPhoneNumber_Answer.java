package quiz;

public class D09_isPhoneNumber_Answer {
	
	public static boolean isValidPhoneNumber(String phoneNumber) {
		// 외곽의 공백은 허용해주겠다
		phoneNumber = phoneNumber.trim();
		
		// 숫자와 -만으로 이루어진 문자열인가
		int len = phoneNumber.length();
		for (int i = 0; i < len; ++i) {
			char ch = phoneNumber.charAt(i);
			
			if (ch != '-' && (ch < '0' || ch > '9')) {
				System.out.println("[System] - 또는 숫자가 아닙니다.");
				return false;
			}
			
			// -가 포함된 번호인 경우 길이가 13이어야 하고 -의 위치도 검사해야 한다
			if (phoneNumber.contains("-")) {
				if (phoneNumber.length() != 13) {
					System.out.println("[System] 번호의 길이가 잘못되었습니다.");
					return false;
			} else if (phoneNumber.indexOf('-') == 3 || 
					phoneNumber.lastIndexOf('-') == 8) {
				System.out.println("[System] -의 위치가 잘못되었습니다.");
				return false;
			}
				System.out.println("[System] 번호의 길이가 잘못되었습니다.");
				return false;
			}
			
			// 모든 -를 제거한 후의 길이가 11인가
			phoneNumber = phoneNumber.replace("-","");
			
			if (phoneNumber.length() != 11) {
				System.out.println("[System] 번호의 길이가 잘못되었습니다.");
				return false;
			}
			
			// 010으로 시작하는가
			if (!phoneNumber.startsWith("010")) {
				System.out.println("[System] 번호가 010으로 시작하지 않습니다.");
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String ph = "010-1234-1234";
		
		System.out.println(isValidPhoneNumber(ph));
	}

}
