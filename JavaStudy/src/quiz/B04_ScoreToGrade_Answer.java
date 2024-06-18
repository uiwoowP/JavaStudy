package quiz;
import java.util.Scanner;


 // 계산하는 부분과 출력하는 부분을 따로 빼는 것이 좋음
 // 에러가 발생하는 부분에서 처리를 해주는 것이 좋음
public class B04_ScoreToGrade_Answer {
	
	public static void main(String[] args) {
		
		// Ctr + Shift + O : import 단축키
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		
		System.out.print("국/영/수 점수 입력 > ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		// 이상한 값이 있을 때 true로 변경할 예정인 변수
		boolean cheat = false;
		
		if (kor < 0 || kor > 100) {
			System.out.println("국어 점수가 이상합니다!");
			cheat = true;
		}  
		if (eng < 0 || eng > 100) {
			System.out.println("영어 점수가 이상합니다!");
			cheat = true;
		}  
		if (math < 0 || math > 100) {
			System.out.println("수학 점수가 이상합니다!");
			cheat = true;
		}
		
		// 이상한 점수가 없으면 평균 점수를 계산
		// 이상한 점수가 있으면 그냥 점수를 넣음
		double avg;
		char grade;
		if (cheat) {
			avg = 0;
			grade = 'F';
		} else {
			avg = (kor + eng + math) / 3.0; // 평균 점수를 구하기 위해 실수로 나눈다
			
			if (avg >= 90) {
				grade = 'A';
			} else if (avg >= 80) {
				grade = 'B';
			} else if (avg >= 70) {
				grade = 'C';
			} else if (avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
		}
		
		if (cheat) {
			System.out.println("잘못된 점수로 인해 " + avg + "0점 처리 되었습니다.");
			System.out.println("등급은 " + grade + "입니다.");
		} else {
			System.out.printf("평균 점수 '%.2f'점으로 '%c' 등급 입니다.\n", avg, grade);
		}
	}
}
