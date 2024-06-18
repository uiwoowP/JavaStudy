package quiz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D05_isJavaVariable {
	
	/* 
	 
	 	사용자로부터 문자열을 입력받으면
	 	해당 문자열이 자바의 변수로 사용할 수 있는 문자열인지 검사해보세요
	 	
	 	Pattern Matcher
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		boolean isVar = false;
		boolean isVarFirst = false;
		
		int i = 0;
		while (i < word.length()) {
			
			if (i == 0 && Character.isJavaIdentifierStart(word.charAt(0))) {
				isVarFirst = true;
			} else {
				if (Character.isJavaIdentifierPart(word.charAt(i))) {
					isVar = true;
				}
				else if (word.contains("This") || word.contains("abstract")) {
					isVar = false;
				}
			}
			++i;
		}
		
		if (isVarFirst && isVar) {
			System.out.println("해당 문자열은 변수로 사용이 가능합니다.");
		} else {
			System.out.println("해당 문자열은 변수로 사용이 불가능합니다.");
		}
	}
	
	private static boolean isValidVarname(String name) {
		
		String regex = "^[a-zA-Z_$][a-zA-z_$0-9]*$";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(name);
		
		return matcher.matches();
	}

}
