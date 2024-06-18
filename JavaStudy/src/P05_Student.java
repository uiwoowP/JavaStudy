/*
 
 클래스의 이름이 같아도 패키지가 다르면 다른 클래스 입니다.
 
 */

public class P05_Student {
	int studentId;
	String studentName;
	int koreanScore;
	int mathScore;
	String koreaSubject;
	String mathSubject;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		P05_Student studentAhn = new P05_Student();
		studentAhn.studentName = "오징어와땅콩볼";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
		
	}


}
