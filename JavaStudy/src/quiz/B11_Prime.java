package quiz;
import java.util.Scanner;

public class B11_Prime {
	
	/*
	 
	   사용자가 정수를 입력하면
	   1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력해보세요
	   
	   ※ 소수(prime): 약수가 1과 자기 자신밖에 없는 수 
	     (2, 3, 5, 7, 11, 13, ..)
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 > ");
		int input = sc.nextInt();
		
		int i = 2;
		while (i < input) {
			if (i == 2 || i == 3 || i == 5 || i == 7) {
				System.out.println(i);
			}
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0 && i % 13 != 0 ) {
				System.out.println(i);
			}
			++i;
		}
		
	}

}
