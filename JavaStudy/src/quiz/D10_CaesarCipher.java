package quiz;

import java.util.Scanner;

public class D10_CaesarCipher {
	final static String aph = "ABCDEFGHIJKLNMOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+"
			+ "abcdefghijklmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
	static StringBuilder sb = new StringBuilder();
	/*
	 
	 	# 시저(카이사르) 암호
	 	
	 	- 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 변경하여 암호문을 생성하는
	 	  암호 알고리즘
	 	  
	 	  [표]
	 	  
	 	  ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
	 	  
	 	  * 암호화
	 	   (평문)		key:3	(암호문)
	 	   HELLO!		--->	KHOOR!
	 	 
	 	 *복호화			key:3
	 	   HELLO!		<---	KHOOR!
	 	   
	 */
	
	// 1. 평문과 키 값이 전달되면 해당 평문을 암호문으로 변환하여 리턴해주는 메서드
	
	// 2. 암호문과 키 값이 전달되면 해당 암호문을 평문으로 변환하여 리턴해주는 메서드
	
	// ※ 암호화 할 수 있는 문자의 종류: 영어 대문자, 소문자, 숫자
	
	static String encrypt(String word, int key) {
		sb.setLength(0);
		
		if (key > aph.length()) {
			key = key % aph.length();
		}
		
		for (int i = 0; i < word.length(); ++i) {
			int idx = aph.indexOf(word.charAt(i));
			
			if (idx + key >= aph.length()) {
				idx = (idx + key) - aph.length();
				sb.append(aph.charAt(idx));
			} else {
				idx = idx + key;
				sb.append(aph.charAt(idx));
			}
		}
		
		return sb.toString();
	}
	
	static String decrypt(String word, int key) {
		sb.setLength(0);
		
		if (key > aph.length()) {
			key = key % aph.length();
		}
		
		for (int i = 0; i < word.length(); ++i) {
			int idx = aph.indexOf(word.charAt(i));
			
			if (idx - key < 0) {
				idx = aph.length() - (idx - key) * -1;
				sb.append(aph.charAt(idx));
			} else {
				sb.append(aph.charAt(idx + (key * -1)));
			}
		}
	
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("암호를 입력하세요");
		String pwd = sc.nextLine();
		
		String enPwd = encrypt(pwd, 1234567890);
		System.out.println("암호화: " + enPwd);
		
		String dePwd = decrypt(enPwd, 1234567890);
		System.out.println("복호화: " + dePwd);
		
	}
}
