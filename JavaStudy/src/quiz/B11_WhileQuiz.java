package quiz;

public class B11_WhileQuiz {
	
	/*
	    while문을 사용하여
	 
	   1. 1000 ~ 2000 사이의 13의 배수를 모두 출력해보세요
	   
	   2. 50부터 100 사이의 모든 숫자의 총합을 구해서 출력해보세요
	   
	   3. 1부터 1000 사이의 모든 10의 배수를 한 줄에 8개씩 출력해보세요
	   
	   4. 1부터 19까지 모든 숫자의 곱을 구해서 출력해보세요
	   
	   5. 8999 ~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
	 
	 */
	
	public static void main(String[] args) {
		
		
		// (1)
		int i = 1000;
		while (i <= 2000) {
			if (i % 13 == 0) {
				System.out.println(i);
			}
			++i;
		}
		
		// (2)
		int i2 = 50;
		int total = 0;
		while (i2 <= 100) {
			System.out.println(i2);
			total += i2;
			System.out.println(total);
			i2++;
		}
		
		// (3)
		int i3 = 1;
		int cnt = 0;
		while (i3++ < 1000) {
			if (i3 % 10 == 0 && cnt < 8) {
				System.out.print(i3 + " ");
				cnt++;
			} else if (i3 % 10 == 0 && cnt == 8) {
				System.out.println();
				System.out.print(i3 + " ");
				cnt = 1;
			}
		}
		
		// (4)
		int i4 = 1;
		long total1 = 1;
		
		while (i4 <= 19) {
			System.out.println(i4);
			total1 *= i4;
			i4++;
		}
		System.out.println(total1);
		
		// (5)
		int i5 = 8999;
		int cnt1 = 0;
		
		while (i5 >= 4999) {
			if (i5 % 287 == 0) {
				cnt1++;
			if (cnt1 == 5) {
				System.out.println(i5);
				}
			} 
			i5--;
		}
	}

}
