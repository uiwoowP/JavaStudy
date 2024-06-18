package baek;
import java.util.Scanner;

public class B_25314 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "long";
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % 4 == 0) {
				System.out.print(str + " ");
			}
		}
		System.out.print("int");
	}

}
