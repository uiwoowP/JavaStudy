package myobj.academy_answer;

public class NetworkStudent extends AcademyStudent {
	int kor;
	int eng;
	int linux;
	int network;
	int ccna;
	
	public NetworkStudent() {
		super();
		kor = generateRandomScore();
		eng = generateRandomScore();
		linux = generateRandomScore();
		network = generateRandomScore();
		ccna = generateRandomScore();
	}
	
	@Override
	public int getTotal() {
		return kor + eng + linux + network + ccna;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 5.0;
	}
	
	public String getGrade() {
		double avg = getAvg();
		
		if (avg >= 90) {
			return "A";
		} else if (avg >= 80) {
			return "B";
		} else if (avg >= 70) {
			return "C";
		} else if (avg >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
	
	@Override
	public String getScores() {
		return String.format("국어: %d\n영어: %d\n"
				+ "리눅스: %d\n네트워크: %d\nccna: %d\n", 
				kor, eng, linux, network, ccna);
	}
	
	
}
