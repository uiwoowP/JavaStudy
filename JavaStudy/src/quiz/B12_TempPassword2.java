package quiz;

public class B12_TempPassword2 {
	/*
	 
	   대문자, 소문자, 특수문자, 숫자로 구성된
	   6자리 랜덤 비밀번호를 20개를 생성하여 출력하는 프로그램을 만들어보세요
	   
	   ※ 비밀번호로 사용 가능한 특수문자의 아스키 범위는 33 ~ 47이다.
	      
	      A - Z : 65 ~ 90 
	      a - z : 97 ~ 122
	 	  0 - 9 : 48 ~ 57
	 	  
	 	  33 - 122
	 */
	
	public static void main(String[] args) {
		
		String tempPwd = "";
		
		for (int i2 = 1; i2 <= 20; i2++) {
			for (int i = 0; i < 6; ++i) {
				int pwd = (int)((Math.random() * 122) + 33);
				System.out.println(pwd);
				if ((pwd >= 58 && pwd <= 64) || (pwd >= 91 && pwd <= 96)) {
					System.out.println(pwd + "*****");
					pwd = (int)((Math.random() * 122) + 33);
					tempPwd += (char)pwd;
				} else {
					tempPwd += (char)pwd;
				}
			 }
			 System.out.println(tempPwd.length());
			 System.out.println(i2 + "번째 비밀번호 : " + tempPwd);
			tempPwd = "";
		}
	}
}
