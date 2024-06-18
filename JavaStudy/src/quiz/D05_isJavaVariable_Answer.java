package quiz;

import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.SourceVersion;

public class D05_isJavaVariable_Answer {
//	static final String keywords[] = { "abstract", "assert", "boolean",
//            "break", "byte", "case", "catch", "char", "class", "const",
//            "continue", "default", "do", "double", "else", "extends", "false",
//            "final", "finally", "float", "for", "goto", "if", "implements",
//            "import", "instanceof", "int", "interface", "long", "native",
//            "new", "null", "package", "private", "protected", "public",
//            "return", "short", "static", "strictfp", "super", "switch",
//            "synchronized", "this", "throw", "throws", "transient", "true",
//            "try", "void", "volatile", "while" };
	
	public static boolean isJavaVariable(String str) {
		
//		if (Arrays.binarySearch(keywords, str) >= 0) {
//			return false;
//		}
		
		// 전달받은 문자열을 다루기 편한 char[]로 변환하겠다
		char[] arr = str.toCharArray();
		
		// 첫 번째 글자가 자바의 변수명으로 적합하지 않으면
		if (!Character.isJavaIdentifierStart(arr[0])) {
			// 메서드를 종료하고 false를 리턴하겠다
			return false;
		}
		
		// 두 번째 글자부터는 isJavaIdentifierPart() 메서드로 확인한다
		for (int i = 1; i < arr.length; ++i) {
			// 한번이라도 적합하지 않은 문자가 등장한다면 false를 반환한다
			if (!Character.isJavaIdentifierPart(arr[i])) {
				return false;
			}
		}
		// 여기까지 도착하면 true를 반환한다
		return true;
	}
	
	public static void main(String[] args) {
		
		// SourceVersion.isKeyword(str)
		// 전달한 문자열이 자바의 예약어인지 확인해주는 메서드
		
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println(">> ");
			String str = sc.nextLine();
			
			if (SourceVersion.isKeyword(str)) {
				System.out.println( str + "는 자바의 예약어입니다. "
						+ "변수로 사용할 수 없습니다.");
				continue;
			}
			
			boolean result = isJavaVariable(str);
			
			System.out.println(result ? 
					str + "은 자바 변수로 적합합니다." :
					str + "은 자바 변수로 부적합합니다.");
		}
		
	}
	
}
