package quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05_EmailListFile_Answer {
	
	// 문자열을 전달해주면 해당 문자열 안에 있는 이메일들만 추출하여 파일로 써주는 메서드
	public static void makeEmailFile(String text) {
		Pattern emailPattern = Pattern.compile("\\S*@\\S*");
		Matcher m = emailPattern.matcher(text);
		
		FileWriter fout = null;
		try {
			fout = new FileWriter("myfiles/emails_answer.txt");
			while (m.find()) {
				fout.append(m.group());
			}			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} 
	}
	
	public static void main(String[] args) {
		makeEmailFile(D11_ReporterList.reporters);
		
	}

}
