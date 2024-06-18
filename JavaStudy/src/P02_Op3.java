
public class P02_Op3 {
	public static void main(String[] args) {
		int num = 5;
		int num1 = 10;
		int i = 2;
		
		// 이 코드는 단락 회로 평가 SCE -> Short Circuit Evaluation 
		// 사칙연산에 의거 / 왼쪽에서 오른쪽 산술 > 비교 > 논리 > 대입 순서
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		//산술 -> 비교 -> 논리 -> 대입
		//       8           6        1    3     5    7     2    4
		boolean value1 = ((num = num * 10) > 45) || ((i = i - 5) < 10);
		
	}

}
