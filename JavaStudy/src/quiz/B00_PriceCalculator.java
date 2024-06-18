package quiz;
import java.util.Scanner;

public class B00_PriceCalculator {
	
	/*
	 * 4가지 음료수 개수를 입력하면 총 가격을 출력해보세요
	 * (각 음료수의 가격은 개당 2300, 2800, 3300, 3500 입니다.)
	 * 
	 * ex> 0 5 0 1
	 *     15000
	 *     
	 *     3 1 1 1
	 *     16500
	 * 
	 */
	
	public static void main(String[] args) {
	
		System.out.print("> ");
		
		Scanner sc = new Scanner(System.in);

		int qty1 = sc.nextInt();
		int qty2 = sc.nextInt();
		int qty3 = sc.nextInt();
		int qty4 = sc.nextInt();
		
		int price1 = 1900;
		int price2 = 2800;
		int price3 = 3300;
		int price4 = 3500;
		
		System.out.printf("1번 음료: %d개\n", qty1);
		System.out.printf("2번 음료: %d개\n", qty2);
		System.out.printf("3번 음료: %d개\n", qty3);
		System.out.printf("4번 음료: %d개\n", qty4);
		
// 무조건 코드를 줄이는 건 좋지 않습니다	
//		System.out.println(
//				qty1 * 2300
//			+	qty2 * 2800
//			+	qty3 * 3300
//			+	qty4 * 3500);
		
	}
}
