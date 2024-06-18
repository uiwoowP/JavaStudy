package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E10_FileEncryption {
	final static String aph = "ABCDEFGHIJKLNMOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+"
			+ "abcdefghijklmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
	static StringBuilder sb = new StringBuilder();
	
	/*
	 
	 	frankenstein.txt를 시저 암호방식으로 암호화한 새파일
	 	frankenstein_encrypted.enc을 생성해보세요
	 	
	 	
	 	(1) char 단위로 한 글자씩 암호화 하는 속도를 측정해보기
	 	
	 	(2) char[] 방식으로 암호화하는 속도를 측정해보기
	 	
	 	(3) Buffered 클래스를 붙여 암호화하는 속도를 측정해보기
	 	
	 	(4) 이미 암호화 파일이 존재한다면 파일의 이름 뒤에 (숫자)를 붙여 다음 파일이 생기게 만들기
	 
	 */
	
	static char encrypt(char ch, int key) {
		
		if (key > aph.length()) {
			key = key % aph.length();
		}
		
			int idx = aph.indexOf(ch);
			
			if (idx + key >= aph.length()) {
				idx = (idx + key) - aph.length();
			} else {
				idx = idx + key;
			}
			
			return ch;
	}
	
	static String encrypt2(String word, int key) {
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
	
	public static void main(String[] args) {
		File frankenstein = new File("myfiles/frankenstein.txt");
		
		long start, end;
		
		// 1.
		start = System.currentTimeMillis();
		try (
				FileReader in = new FileReader(frankenstein);
				FileWriter out = new FileWriter(new File("myfiles/frankenstein(1).enc"))
				) {
			
			int ch;
			while((ch = in.read()) != -1) {
				out.write(encrypt((char)in.read(), 3));
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		
		long time1 = end - start;
		
		System.out.println("1. 한글자씩 암호화 하는 속도 : " + time1 + "ms");
		
		
		start = System.currentTimeMillis();
		try (
				FileReader in = new FileReader(frankenstein);
				FileWriter out = new FileWriter(new  File("myfiles/frankenstein(2).enc"))
				) {
			
			char[] buff = new char[2048];
			int len;
			
			while ((len = in.read(buff)) != -1) {
				out.write(encrypt2(new String(buff, 0, len), 3));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		
		long time2 = end - start;
		
		System.out.println("2. char[] 암호화 하는 속도 : " + time2 + "ms");
		
		// 3. 
		
		start = System.currentTimeMillis();
		try (
				FileReader fin = new FileReader(frankenstein);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(new File("myfiles/frankenstein(3).enc"));
				BufferedWriter out = new BufferedWriter(fout);
				) {
			
			String line;
			while ((line = in.readLine()) != null) {
				out.write(encrypt2(line, 3));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		
		long time3 = end - start;
		System.out.println("3. Buffered 암호화 하는 속도 : " + time3 + "ms");
		
//		try {
//			int fileCount = 0;
//			String fileName = "myfiles/frankenstein.enc";
//			File file = new File(fileName);
//			
//			while (file.exists()) {
//				fileCount++;
//				fileName = "myfiles/frankensten(" + fileCount + ").enc";
//				file = new File(fileName);
//			}
//		}
//			
//			try (
//					FileReader in = new FileReader();
//					FileWriter out = new FileWriter();
//					) {
//				
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
