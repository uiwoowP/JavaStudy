package finalex;

public class UsingDefine {
	/*
	 	
	 	보안과 관련되어 있거나 변하면 안되는 경우에는 클래스 자체를 final로 선언
	 	
	 */
	
	public static void main(String[] args) {
		System.out.println(Define.GOOD_MORNING);
		System.out.println("최솟값은 " + Define.MIN + "입니다.");
		System.out.println("최댓값은 " + Define.MAX + "입니다.");
		System.out.println("수학 과목 코드 값은 " + Define.MATH + "입니다.");
		System.out.println("영어 과목 코드 값은 " + Define.ENG + "입니다.");
		
	}

}
