package myobj.academy_answer;

public class ProgrammingStudent2 extends AcademyStudent {
	String[] subjects = {"국어", "영어", "수학", "C언어", "운영체제", "자료구조"};
	int[] scores = new int[subjects.length];
	
	public ProgrammingStudent2() {
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = generateRandomScore();
		}
	}
	
	@Override
	public int getTotal() {
		int sum = 0;
		for (int i = 0; i < scores.length; ++i) {
			sum += scores[i];
		}
		return sum; 
	}
	
	@Override
	public double getAvg() {
		return getTotal() / scores.length;
	}
	
	@Override
	public String getGrade() {
		return super.getGrade();
	}
	
	@Override
	public String getScores() {
		String str = "";
		
		for (int i = 0; i < scores.length; ++i) {
			str += String.format("%s: %s\n", 
					subjects[i], scores[i]);
		}

		return str;
	}
	
}
