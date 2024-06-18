package baek;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class B_11022 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int test = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < test; ++i) {
			st = new StringTokenizer(br.readLine());
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int total = num1 + num2;
			
			String str = String.format("Case #%d: %d + %d = %d", i + 1, num1, num2, total);
			
			bw.write(str + "\n");
		}
		bw.flush();
		bw.close();
	}

}
