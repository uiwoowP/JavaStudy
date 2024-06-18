package baek;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class B_11021 {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < test; ++i) {
			st = new StringTokenizer(br.readLine());
			
			int total = Integer.parseInt(st.nextToken())
					+ Integer.parseInt(st.nextToken());
			
			String str = String.format("Case #%d: %d", i + 1, total);
			
			bw.write(str + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}
