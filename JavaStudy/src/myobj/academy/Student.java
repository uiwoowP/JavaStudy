package myobj.academy;

import java.util.Arrays;

public class Student extends Foundation {
	String name;
	int studentId;
	String major;
	String[] subjects;
	int scores[];
	
	String[] web = {"국어", "영어", "수학", "C언어", "운영체제", "자료구조"};
	String[] net = {"국어", "영어", "리눅스", "네트워크", "CCNA"};
	String[] mac = {"국어", "영어", "수학", "통계", "파이썬", "NO-SQL"};
	
	public Student(int studentId) {
		this.name = ranName();
		this.studentId = studentId;
		this.major = randMajor();
		this.subjects = genSubject(this.major);
		this.scores = genScores(this.major);
	}
	
	String ranName() {
		String nameTable = "김강윤송이박민최수바독별한인수오나한뜸으보벽새은별운하힘찬범제뜸담빛구햇람천문익라늘솜"
				+ "가나다라마바사아자차카타파하히후헤호"
				+ "수한무거북이와두루미삼천갑자동방삭";
		int lenName = (int)((Math.random() * 5) + 2);
		String tempName = "";
		for (int i = 0; i < lenName; ++i) {
			int ran = (int)(Math.random() * nameTable.length());
			tempName += nameTable.charAt(ran);
		}
		return tempName;
	}
	
	String randMajor() {
		int ranNum = (int)(Math.random() * 2);
		
		switch (ranNum) {
		case 0: return "WebProgramming";
		case 1: return "Network";
		case 2: return "MachineLearning";
		
		default: return "";
		}
	}
	
	String[] genSubject(String major) {
		
		switch (major) {
		case "WebProgramming":
			subjects = new String[6];
			for (int i = 0; i < subjects.length; ++i) {
				subjects[i] = web[i];
			}
			return subjects;
			
		case "Network":
			subjects = new String[5];
			for (int i = 0; i < subjects.length; ++i) {
				subjects[i] = net[i];
			}
			return subjects;
			
		case "MachineLearning":
			subjects = new String[6];
			for (int i = 0; i < subjects.length; ++i) {
				subjects[i] = mac[i];
			}
			return subjects;
			
		default:
			return subjects;
		}
		
	}
	
	int[] genScores(String major) {
		
		switch (major) {
		case "WebProgramming":
			scores = new int[6];
		case "Network":
			scores = new int[5];
		case "MachineLearning":
			scores = new int[6];
		}
		
		int[] tempArr = new int[scores.length];
		for (int i = 0; i < scores.length; ++i) {
			
			tempArr[i] = (int)(Math.random() * 99);
			scores[i] = tempArr[i];
		}
		
		return scores;
	}
	
	void addSubject(String major) {
		
		switch (major) {
		case "WebProramming":
		case "Network":
		case "Machinelearning":
		}
	}

	void showInfo() {
		System.out.printf("%d번 학생 %s 님의 전공은 %s 입니다.\n",
				studentId, name, major);
		System.out.printf("%d번 학생님의 과목은 %s \n",
				studentId, Arrays.toString(subjects));
		System.out.printf("%d번 학생님의 현재 점수는 %s \n",
				studentId, Arrays.toString(scores));
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(0);
		
		s1.showInfo();
	}
}
