package quiz;
import java.util.Scanner;

public class B05_MonthToSeason {
	
	/*
	  사용자로부터 몇월인지 입력받으면 해당하는 계절을 출력해보세요
	  (switch-case문, if 문으로 한 번씩 만들기)
	  
	 */
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력해 주세요>" );
		int month = sc.nextInt();
		
		// 1번 switch 문
		switch (month) {
			case 3: case 4:
				System.out.printf("%d월은 봄 입니다.", month);
				break;
			case 5: case 6: case 7: case 8:  
				System.out.printf("%d월은 여름 입니다.", month);
				break;
			case 9: case 10: case 11: 
				System.out.printf("%d월은 가을 입니다.", month);
				break;
			case 12: case 1: case 2:
				System.out.printf("%d월은 겨울 입니다.", month);
				break;
			default:
				System.out.println("해당 월을 숫자로 입력해 주세요");
				break;		
		}
		
		// 2번 if 문
		if (month != (int)month && month > 12 && month < 0) {
			System.out.println("해당 월을 숫자로 입력해 주세요");
		} else {
			if (month >= 3 && month < 4) {
				System.out.println("봄 입니다.");
			} else if (month == 4 || (month >= 4 && month < 9)) {
				System.out.println("여름 입니다.");
			} else if (month == 9 || (month >= 9 && month < 11)) {
				System.out.println("가을 입니다.");
			} else if (month < 3) {
				System.out.println("겨울 입니다.");
			} else if (month >= 11) {
				System.out.println("겨울 입니다.");
			}
		}
		
	}
	
}
