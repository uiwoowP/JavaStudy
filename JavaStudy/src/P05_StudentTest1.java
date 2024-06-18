
public class P05_StudentTest1 {
	

	
	
	public static void main(String[] args) {
		P05_Student student1 = new P05_Student();
		student1.studentName = "새우깡";
		System.out.println(student1.getStudentName());
		
		P05_Student student2 = new P05_Student();
		student2.studentName = "포테토칩";
		System.out.println(student2.getStudentName());
		
		System.out.println(student1); // 힙 메모리에 생성된 인스턴스 메모리의 주소는 참조 변수에 저장
		System.out.println(student2); // 주소값은 다른 말로 해시 코드(hash code) 값이라고도 합니다.
		
	}

}
