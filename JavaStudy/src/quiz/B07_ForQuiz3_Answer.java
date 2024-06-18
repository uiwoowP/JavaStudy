package quiz;
import java.util.Scanner;

public class B07_ForQuiz3_Answer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("목표 숫자: ");
		int target = sc.nextInt();
		int absValue = Math.abs(target);
		
		// 비교 자리에 함수가 들어있으면 반복을 할때마다 연산을 진행
		for (int i = 0, cnt = 0; i <= absValue; ++i) {
			if (i % 3 == 0) {
				if (target < 0) {
					System.out.printf("%d\t", i);
				} else {
					System.out.printf("%d\t", i);
				}
				
				if (++cnt % 6 == 0) {
					System.out.println();
				}
			}
		}
		
		
//		if (target >= 0) {
//			for (int i = 0, cnt = 0; i <= target; ++i) {
//				if (i % 3 == 0) {
//				// 정수와 문자타입을 더하면 문자코드와 정수값을 더해버린다
//				// 문자타입도 이어붙이기를 하기 위해서는 문자열과의 +가 필요하다
//				System.out.print(i + "\t");
//				
//					if (++cnt % 6 == 0) {
//						System.out.println();
//					}
//				}
//			}
//		} else {
//			// target이 음수일 때 도착하는 곳
//			for (int i = 0, cnt = 0; i >= target; --i) {
//				if (i % 3 == 0) {
//					System.out.print("" + i + '\t');
//					
//					if (++cnt % 6 == 0) {
//						System.out.println();
//					}
//				}
//			}
//		}
		
	}

}
