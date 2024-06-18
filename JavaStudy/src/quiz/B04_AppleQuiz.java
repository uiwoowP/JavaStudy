package quiz;
import java.util.Scanner;

public class B04_AppleQuiz {
	
	/*
	  사과를 10개씩 담을 수 있는 바구니가 있다.
	  사용자가 사과 개수를 입력하면 사과를 모두 담기 위해 필요한
	  바구니의 개수를 알려주는 프로그램을 만들어보세요
	  
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사과의 갯수를 입력해 주세요 >");
		int apple = sc.nextInt();
		
		int basket = 10;
		
		if (apple > 10) {
			basket = (basket * (apple / 10));
			
			if (apple % 10 == 0) {
				
				System.out.printf("사과를 담을 수 있는 바구니의 수는 %1d", (basket / 10));
				System.out.print("개 입니다.");
				
			} else {
				
				System.out.printf("사과를 담을 수 있는 바구니의 수는 %1d", (basket / 10) + 1);
				System.out.print("개 입니다.");
			}
			
		} else if (apple == 10) {
			
			System.out.print("사과를 담을 수 있는 바구니의 수는 1개 입니다.");
			
		} else if (apple < 0) {
			
			System.out.print("사과를 담을 수 있는 바구니의 수는 0개 입니다.");
		} else {
			
			System.out.print("사과를 담을 수 있는 바구니의 수는 1개 입니다.");
		}
		
	}

}
