package baek;

public class Math1 {
	
	public static void main(String[] args) {
		int [] studentIDs; //배열 자료형을 먼저 선언하고 초기화 하는 경우에는 new int[]를 생략할 수 없습니다.
		studentIDs = new int [ ] {101, 102, 103};
		
		int [] studentIDs1 = {101, 102, 103};
		
		studentIDs[0] = 10;
		
		System.out.println(studentIDs);
	}
	
}