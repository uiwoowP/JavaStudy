package quiz;

public class B08_Palindrome2_Answer {
	
	public static void main(String[] args) {
		
		// 원래 단어와 거꾸로 뒤집은 단어가 같으면 좌우대칭
		// 문자열에 += 로 하나씩 char대입
		
		String word = "MOM";
		
		int len = word.length();
		
		String reversed = "";
		
		for (int i = 0; i < len; ++i) {
			//System.out.printf("%c", word.charAt(len - 1 - i));
			reversed += word.charAt(len - 1 - i);
		}
		
		System.out.println("좌우대칭 입니까? " + reversed.equals(word));
		
	}
}
