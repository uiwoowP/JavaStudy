package quiz;

public class B11_WhileQuiz_Answer {
	
	public static void main(String[] args) {
		
		// 1.
		int i = 1000;
		while (i <= 2000) {
			if (i % 13 == 0) {
				System.out.println(i);
			}
			++i;
		}
		
		// 2. 50부터 100 사이의 모든 숫자의 총합을 구해서 출력해보세요
		i = 50;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			++i;
		}
		System.out.println("총합: " + sum);
		
		// 3. 1부터 100 사이의 모든 10의 배수를 한 줄에 8개씩 출력해보세요
		i = 1;
		int cnt = 0;
		while (i <= 1000) {
			if (i % 10 == 0 ) {
				System.out.print(i + "\t");;
				
				if (cnt++ % 8 == 0) {
					System.out.println();
				}
			}
			++i;
			
		}
		System.out.println();
		
		// 4. 1부터 19까지 모든 숫자의 곱을 구해서 출력해보세요
		i = 1;
		long sum2 = 1;
		
		while (i <= 19) {
			sum2 *= i;
			++i;
		}
		System.out.println(sum2);
		
		// 5. 8999 ~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
		i = 8999;
		cnt = 0;
		while (i >= 4999) {
			// && 연산은 
			if (i % 287 == 0 && ++cnt == 5)  {
				System.out.println("5번째 287의 배수: " + i);
				}
			--i;
			}
		
	}
}
