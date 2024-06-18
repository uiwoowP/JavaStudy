package javatest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class GuGuDan {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("gugudan.txt");
		for (int i = 2; i <= 9 ; ++i) {
			for (int j = 1; j <= 9; ++j) {
				String gugu = String.format("%d X %d = %d\t", i, j, i * j);
				fw.write(gugu);
			}
			fw.write('\n');
		}
		fw.close();
		
		FileReader fr = new FileReader("gugudan.txt", Charset.forName("UTF-8"));
		int ch; 
		while ((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		fr.close();
		
	}

}
