package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class E07_Copy {
	
	
	/*
	 	폴더의 경로를 전달하면 같은 경로에 폴더 이름2를 만들고
	 	안의 모든 내용을 복사해주는 메서드를 만들어보세요
	 	
	 	ex1> dog 폴더의 경로를 전달하면 안에 있는 모든 강아지 사진이 복사된 dog2 폴더가 생겨야 함
	 	ex2> myimage 폴더의 경로를 전달하면 내부의 모든 내용이 그대로인 myimage2가 생겨야 함
	 */
	
	public static void copyDir (String address) throws IOException {
		File f = new File(address);
		File newF = new File(address + "2");
		
		if (!newF.exists()) {
			newF.mkdirs();
		}
		
		if (f.isDirectory()) {
			String[] files = f.list();
			for (String file : files) {
				String path = f.getAbsolutePath() + "/" + file;
				String dest = newF.getAbsolutePath() + "/" + file;
				copyFile(path, dest);
			}
		}
	}
	
	public static void copyFile(String from, String to) throws IOException {
		
		File fromFile = new File(from);
		
		if (fromFile.isDirectory()) {
			copyDir(from);
		} else {
			FileInputStream fis = new FileInputStream(from);
			FileOutputStream fos = new FileOutputStream(to);
			
			byte[] bt = new byte[1024];
			int len;
			while ((len = fis.read(bt)) > 0) {
				fos.write(bt, 0, len);
				
			}
			
			fis.close();
			fos.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		copyDir("myimages/");
		
	}
}
