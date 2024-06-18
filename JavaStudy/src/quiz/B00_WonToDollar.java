package quiz;
import java.util.Scanner;

public class B00_WonToDollar {
	
	/*
	 * 
	 * 한국 돈을 입력하면 달러로 얼마인지 출력해주는 프로그램을 만들어보세요
	 * (현재 환율은 검색)
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한국 돈을 입력해 주세요: ");
		
		double won = sc.nextInt();
		
		// 1달러 당 1373.55원
		
		double usd = 0.00073;
		
		double currency = won * usd;
				
		System.out.println(currency + "입니다");
		
	}

}
