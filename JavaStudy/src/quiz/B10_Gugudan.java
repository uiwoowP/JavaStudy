package quiz;

public class B10_Gugudan {
	
	/*
	  
	   1. 구구단을 다음과 같이 가로로 출력해보세요
	   
	   2단: 2x1=2 2x2=4 2x3=6 ...
	   3단: 3x1=3 3x2=6 ...
	   4단: ...
	   
	   2. 구구단을 다음과 같이 세로로 출력해보세요
	   
	   2단  3단  4단 ...
	   2x1=2 3x1=3 4x1=4 ...
	   2x2=4 3x2=6 4x2=8 ...
	  
	 */
	
	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.println();
			for (int gop = 1; gop <= 9; ++gop) {
				if (gop == 9) {
					System.out.printf("%d x %d = %2d ", dan, gop, dan * gop);
				} else if (gop == 1) {
					System.out.printf("%d단: %d x %d = %2d ", dan, dan, gop, dan * gop);	
				} else {
					System.out.printf("%d x %d = %2d ", dan, gop, dan * gop);	
				}
			}
		}
		
		System.out.println("\n");
		System.out.println("\t2단\t\t3단\t\t4단\t\t5단\t\t6단\t\t7단\t\t8단\t\t9단");
		for (int gop = 1; gop <= 9; ++gop) {
			System.out.println();
			for(int dan = 2; dan <= 9; ++dan) {
				System.out.printf("\t%d x %d = %d", dan, gop, dan * gop);
				
			}
		}
		
		
	}
	
}
