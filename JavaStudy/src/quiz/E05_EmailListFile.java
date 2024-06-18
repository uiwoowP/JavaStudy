package quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class E05_EmailListFile {
	/*
	 	D11번 문제에 있는 기자들의 이메일들로만 이루어진 파일을 myfiles폴더에 생성해보세요
	 */
	
	public static void main(String[] args) throws IOException {
		D11_ReporterList rep = new D11_ReporterList();
		
		Pattern email = Pattern.compile("\\w+[@]\\w+\\.\\w+\\.*\\w+");
		Matcher emailMatcher = email.matcher(rep.reporters);
		
		FileWriter out = new FileWriter("myfiles/email.txt");
		while (emailMatcher.find()) {
			out.write(emailMatcher.group() + '\n');
			
		}
		out.close();
	}
}
