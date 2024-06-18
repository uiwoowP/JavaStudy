package baek;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class B_2439 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		char arr[] = new char[n]; 
		for (int i = 1; i <= n; ++i) {
			for (int j = 0; j < i; ++j) {
				arr[arr.length-i] = '*';
			}
			String star = new String(arr);
			bw.write(star + "\n");
		}
		bw.flush();
		bw.close();
	}
}
