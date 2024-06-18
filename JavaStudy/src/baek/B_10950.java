package baek;
import java.util.Scanner;

public class B_10950 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		int[] total = new int[test];
		
		for (int i = 0; i < test; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			total[i] = a + b;
		}
		
		for (int i = 0; i < test; i++) {
			System.out.println(total[i]);
		}
	}
}
