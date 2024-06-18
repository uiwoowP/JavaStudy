package quiz;

public class B07_ForQuiz2 {
	
	/*
	 
	  # for문을 사용해서 숫자를 다음과 같이 출력해보세요
	  
	    1. 0 3 6 9 12 ... 93 96 99
	    
	    2. -35 -28 -21 ... 0 7 14 ... 35
	    
	    3. 100 200 300 ... 800 900 1000
	    
	    4. 100 99 98 ... 5 4 3 2 1 0
	    
	    5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ... (30번)
	    
	    6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ... (30번)
	    
	    7. 7 77 777 7777 77777 .... 7777777777
	    
	 */
	
	public static void main(String[] args) {
		
//		//1
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i);
			}
		}
		
		System.out.println();
		//2
		for (int i = -35; i <= 35; i++) {
			if (i % 7 == 0) {
				System.out.print(i);
			}
		}
//		
		System.out.println();
//		//3
		for (int i = 100; i <= 1000; i++) {
			if (i % 100 == 0) {
				System.out.printf("%5d", i);
			}
		}
		
		System.out.println();
		//4
		for (int i = 100; i <= 0; i--) {
			System.out.printf("%5d", i);
		}
		
		System.out.println();
		//5
		for (int n = 0; n <= 30; n++) {
			System.out.println();
			for (int i = 0, cnt = 0; i < 10; i++) {
				System.out.printf("%3d", cnt);
				cnt++;
		 }
		}
		
		System.out.println();
		//6
		for (int n = 0; n <= 30; n++) {
			System.out.println();
			for (int i = 0, cnt = 10; i < 10; i++) {
				System.out.printf("%3d", cnt);
				cnt--;
			}
		}
		
		System.out.println();
		//7
		long num = 100000000;
		for (int i = 0, n = 10; i < 10; n *= 10, i++) {
			
			System.out.println(n);
			System.out.println(i);
			
		}
		
	}
	

}
