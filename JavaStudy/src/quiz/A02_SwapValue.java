package quiz;

import java.util.Random;

public class A02_SwapValue {
	
	public static void main(String[] args) {
		// "랜덤 번호 생성 기계"를 하나 만든다
		Random ran = new Random();
		
		int a = ran.nextInt(30);
		int b = ran.nextInt(30);
		
		System.out.println("a에 원래 보관된 값: " + a);
		System.out.println("a에 원래 보관된 값: " + b);
		
		// 코드를 추가해 두 변수의 값을 서로 교환하여 출력해보세요 (다른곳은 변경 불가능)
		
		// **** 정수값을 변경하려고 할때 가장 원시적인 방법으로 값을 다른 값에 대입해 둔후 바꾸는 방식으로 변경 
		
		// a = b를 실행하고 나면 a에 원래 보관되어 있던 값이 사라지게 된다
		a = b;
		// b = a를 실행하더라도 이미 a의 값은 b로 변해있기 때문에 두 값이 같아진다
		b = a;
		
		// a의 값이 사라지는 것을 대비하여 따로 빼놓는다
		int temp = a;
		
		// a에는 b의 값을 대입한다
		a = b;
		// b에는 아까 따로 빼놨던 a의 원래 값을 대입한다
		b = temp;
		
		///////////////////////////////////////////////////////////////
		System.out.println("a에 보관된 값: " + a);
		System.out.println("b에 보관된 값: " + b);
		
		
		
		
	}

}
