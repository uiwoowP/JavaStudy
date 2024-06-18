package quiz;

public class A03_TypeQuiz {
	public static void main(String[] args) {

		String name = "홍길동";
		int age = 20; // 자원을 아주 절약해야 하는 상황이 아니라면 그냥 int쓰는 편
		String tel = "010-1234-1234";
		double height = 178.5;
		double weight = 75;
		// 실수가 정수를 무조건 이긴다
		// AB형은 char타입에 저장할 수 없으므로 String을 써야 한다
		String blood = "O";
		
		System.out.println('\n');
		System.out.println("==========출력 결과==========");
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("Tel\t: " + tel);
		System.out.println("키\t: "  + height);
		System.out.println("몸무게\t: " + weight);
		System.out.println("혈액형\t: " + blood);
	}

}