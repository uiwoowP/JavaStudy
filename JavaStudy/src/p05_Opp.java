
public class p05_Opp {
	/*
	 
	 함수를 호출하면 그 함수만을 위한 메모리 공간이 할당 되는데,
	 이 메모리 공간을 Stack 이라고 부릅니다.
	 
	 클래스 자료형과 상관없이 클래스 내에서 this를 사용하면
	 자신의 주소값을 반환할 수 있다는 것을 알아두세요.
	 
	 */
	
	int sudentID;
	String studentName;
	int grade;
	String address;
	
	
	
	public  String setStudentName(String name) {
		return studentName = name;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int subtract(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static int divide(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
	
	

}
