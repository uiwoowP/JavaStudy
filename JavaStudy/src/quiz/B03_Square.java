package quiz;
import java.util.Scanner;

public class B03_Square {
	
	/*
	  ※ 직사각형의 넓이를 계산하고 출력하시오
	  
	  [조건]
	  
	  ▷ 문자열 변수로 직사각형 이름 입력받기
	  ▷ 실수형 변수로 가로, 세로 길이 입력받기
	  ▷ 이름과 넓이 출력하기
	    (이름에 쌍따옴표 넣고 넓이는 소수점 2자리까지 출력 printf 활용)
	  ▷ 넓이가 100초과 500미만이라면 true 출력
	  
	  [예시]
	  
	  이름 입력: 상민
	  가로 입력: 10.5
	  세로 입력: 10.5
	  "상민" 직사각형의 넓이는 110.25
	  true
	  
	 */
	
	public static void main(String[] args) {
		
		String name;
		double width;
		double height;
		
		System.out.println("이름을 입력해 주세요 > ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("가로 길이를 입력해 주세요 > ");
		width = sc.nextDouble();
		System.out.println("세로 길이를 입력해 주세요 > ");
		height = sc.nextDouble();
		double square = (Math.round(height * height * 100) / 100.0);
		System.out.printf("\"%s\" : 넓이 %.2f \n", name, square);
		System.out.println(square > 100 && square < 500);
		
	}

}


