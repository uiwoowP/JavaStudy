package quiz;

public class B07_ForQuiz {
	
	/*
	 
	   1. 1000 ~ 2000 사이의 13의 배수를 모두 출력해보세요
	   
	   2. 50부터 100 사이의 모든 숫자의 총합을 구해보서 출력해보세요
	   
	   3. 1부터 1000 사이의 모든 10의 배수를 한 줄에 8개씩 출력해보세요 
	   
	   4. 1부터 19까지의 모든 숫자의 곱을 구해서 출력해보세요
	   
	   5. 8999 ~ 4999 사이의 5번째 287의 배수를 출력해보세요
	 
	 */
	
	public static void main(String[] args) {
		
//		//1
//		for (int i = 1000; i < 2000; i++) {
//			if (i % 13 == 0) {
//				System.out.println(i);
//			}
//		}
//		
//		//2
//		int sum = 0;
//		for (int i = 50; i < 100; i++) {
//			sum += i;
//			System.out.println(sum);
//		}
		
		//3
		for (int i = 0; i <= 1000; ++i) {
			if (i != 0) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
				if (i % 16 == 0) {
					System.out.println();
				}
			}
		}
	}
		//4
//		int total = 1;
//		for (int i = 1, cnt = 1; cnt < 20; cnt++) {
//			total *= i;
//			System.out.println(total);
//			i++;
//		}
		
		//5 
		for (int i = 8999, cnt = 1; i <= 4999; i--) {
			if (i % 287 == 0 && cnt == 1316) {
					System.out.printf("%d", i);
			}
		}
		
		
	}

}
