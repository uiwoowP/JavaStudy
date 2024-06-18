package quiz;

public class B12_TempPassword_Answer {
	
	public static void main(String[] args) {
		
		for (int i2 = 1; i2 <= 20; ++i2) {
			String password = "";
			for (int i = 0; i < 4; ++i) {
				password += (char)(Math.random() * 26 + 65);
			}
			System.out.println(i2 + "번째 비밀번호: " + password);
		}
			
	}

}
