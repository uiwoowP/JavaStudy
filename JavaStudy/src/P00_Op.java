/*
 * 
 * 오버로딩 -> 접근 제어자를 자유롭게 지정 가능, 매개변수의 차이로만 구현
 * 
 * 1. 같은 기능을 하는 메소드를 하나의 기능으로 사용할 수 있다
 * 2. 메소드의 이름을 절약할 수 있다 
 * 
 * 메소드 오버라이딩 -> @Override 오버라이딩 검증 기능
 * 업캐스팅 
 * 다운캐스팅 
 * 인터페이스 
 * 추상메소드 
 * 추상클래스 
 * 
 */

public class P00_Op {
	
	static public void main(String[] args) {
		
		/*
		 * 단항 연산자 -> 항이 한개인 연산자 ++ num
		 * 이항 연산자 -> 항이 두개인 연산자 
		 * 
		 * 1. public
		 * 2. protected
		 * 3. default
		 * 4. private
		 * 
		 * 접근 제어자가 있는경우 getter 와 setter를 통해서 반환가능
		 * 
		 * 다형성
		 * 
		 */
		
		
		int num1 = 10;
		int i = 2;
		
		// 이니셜라이징과 연산 동시 할당
		// 논리 곱에서 앞 항의 결과 값이 거짓이므로 이 문장은 실행되지 않습니다
		boolean value = ((num1 = num1 + 10) > 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// 변수 값 다시 연산하며 할당
		// 논리 합에서 앞 항의 결과 값이 참이므로 이 문장은 실행되지 않습니다.
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		//조건 연산자를 활용하여 나이를 비교
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T': 'F';
		
		System.out.println(ch);
		
		
		
		
	}

}
