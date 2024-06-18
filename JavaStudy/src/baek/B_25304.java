package baek;
import java.util.Scanner;


public class B_25304 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		int items = sc.nextInt();
		
		int total = 0;
		for (int i = 0; i < items; i++) {
			int price = sc.nextInt();
			int item = sc.nextInt();
			total += (item * price);
			
		}
		
		if (total == x) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
		
	}

}
