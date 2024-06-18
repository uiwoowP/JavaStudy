package quiz;
import java.util.Scanner;

public class B00_AgeCalculator {
	
	/*
	 * 
	 * 이름과 태어난 년도를 입력하면 이름과 나이를 출력해주는 프로그램을 만들어보세요
	 * 
	 */
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("이름과 태어난 년도를 입력해 주세요");
	
	String name = sc.next();
	int age = sc.nextInt();
	int num1 = 1234;
	int num2 = 786;
	
	// 1234 - age + 786
	
	System.out.print(name);
	System.out.print("(" + (num1 - age + num2) + "세)");
	
	}
	
}
