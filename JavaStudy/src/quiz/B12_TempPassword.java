package quiz;

public class B12_TempPassword {
	/*
	 
	 	알파벳 대문자로만 구성된 랜덤 4자리 비밀번호를
	 	20개 생성하여 출력해 보세요
	 
	  A - Z : 65 ~ 90
	  
	  System.out.println((int)(Math.random() * 20) + 20);
	
	*/
	
	public static void main(String[] args) {
		String tempPwd = "";
		
		for (int i = 0; i < 20; ++i) {
			for (int j = 0; j <4; ++j) {
				int pwd = (int)((Math.random() * 26) + 65);
				tempPwd += (char)pwd;
			}
			System.out.println(tempPwd);
			tempPwd = "";
		}
	}

}
