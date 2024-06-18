package quiz;

import java.util.Scanner;

public class B04_ScoreToGrade {

	/*
	 * 국어, 영어, 수학 점수를 차례대로 입력받아 평균 점수를 구한 후에 평균 점수와 등급을 출력해주는 프로그램을 만들어보세요 (각 과목의 유효
	 * 점수는 0 ~ 100점이고, 유효하지 않은 점수가 하나라도 있다면 평균 점수는 0점, 등급은 F로 나와야 한다)
	 * 
	 * 1. 평균점수 90점이상 A 평균점수 80점이상 B 평균점수 70점이상 C 평균점수 60점이상 D 그 외 F
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("국어 점수를 입력해 주세요: ");
		int korean = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요: ");
		int english = sc.nextInt();
		System.out.println("수학 점수를 입력해 주세요: ");
		int math = sc.nextInt();
		int total = korean + english + math;
		char grade;

		double average = total / 3.0;

		if (korean < 0 || english < 0 || math < 0) {
			System.out.println("점수를 다시 입력해 주세요. 유효 점수의 범위는 0 ~ 100점 입니다.");
		} else if (korean > 100 || english > 100 || math > 100) {
			System.out.println("점수를 다시 입력해 주세요. 유효 점수의 범위는 0 ~ 100점 입니다.");
		} else if (average >= 90) {
			grade = 'A';
			System.out.printf("평균 점수는 %.1f 등급은 %s 입니다", average, grade);
		} else if (average >= 80) {
			grade = 'B';
			System.out.printf("평균 점수는 %.1f 등급은 %s 입니다", average, grade);
		} else if (average >= 70) {
			grade = 'C';
			System.out.printf("평균 점수는 %.1f 등급은 %s 입니다", average, grade);
		} else if (average >= 60) {
			grade = 'D';
			System.out.printf("평균 점수는 %.1f 등급은 %s 입니다", average, grade);
		} else {
			grade = 'F';
			System.out.printf("평균 점수는 %.1f 등급은 %s 입니다", average, grade);
		}

	}

}
