package quiz;

public class B07_ForQuiz_Answer {
	
	public static void main(String[] args) {
//		
//		for (int num = 1000; num <= 2000; num++) {
//			System.out.printf("%d\n", num);
//			if (num % 13 ==0) {
//				System.out.printf("%d\n", num);
//			}
//		}
//		
////		for (int num = 13; num <= 2000; num += 13)
////			if (num >= 1000) {
////				System.out.printf("%d\n", num);
////			}
//		
//		// 총합을 누적시키기 위한 변수를 하나 생성하고 계속 누적시킨다
//		int total = 0;
//		
//		for (int i = 51; i <= 100; ++i) {
//			total += i;
//		}
//		System.out.println("총합은 " + total);
//		
//		for (int i = 1, printCount = 0; i <= 1000; ++i) {
//			if (i % 10 == 0) {
//				System.out.printf("%6d", i);
//				
//				++printCount; // 10의 배수를 출력한 횟수를 센다
//				
//				if (printCount % 8 == 0) {
//					System.out.println();
//				}
//			}
//		}
		
//		for (int i = 10; i <= 1000; i += 10) {
//			
//			System.out.printf("%6d", i);
//			
//			if (i % 80 == 0) {
//				System.out.println();
//			}
//		}
//		
//		System.out.println();
//		
//		long total2 = 1;
//		
//		for (int i = 1; i <= 20; ++i) {
//			System.out.printf("%d x %d = %d\n", total2, i, total2 *= i);
//		}
//		
		for (int i = 8999, cnt = 0; i >= 4999; --i) {
			if (i % 287 == 0) {
				++cnt;
				if (cnt == 5) {
					System.out.printf("[%d번째 287의 배수: %d]\n", cnt, i);
				} else {
					System.out.printf("%d번째 287의 배수: %d\n", cnt, i);
				}
			}
			
		}
		
	}

}
