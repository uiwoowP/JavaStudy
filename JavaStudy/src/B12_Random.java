import java.util.Random;

public class B12_Random {
	
	/*
	 
	   # 무작위 숫자 생성하기
	   
	   1. java.util.Random 클래스
	   
	   2. Math.random() 함수 사용하기
	 
	 */
	
	public static void main(String[] args) {
		
		// 새로운 랜덤 시드 생성 (생성 시점에서 모든 숫자가 결정된다)
		// 랜덤 시드를 생성하면서 원하는 시드 번호를 전달할 수도 있다
		// 전달하지 않는 경우 현재 시간이 시드 번호가 된다
		Random ran1 = new Random(1000);
		Random ran2 = new Random(1002);
		Random ran3 = new Random(); // 현재 시간에 따라 랜덤 시드가 생성된다
		
		// System.currentTimeMillis() : 현재 시간을 밀리초로 알려준다
		System.out.println("현재 시간: " + System.currentTimeMillis());
		
		// 만들어진 랜덤 시드로부터 랜덤 숫자 10개 꺼내기
		for (int i = 0; i < 10; ++i) {
			System.out.println(ran1.nextInt());
			System.out.println(ran2.nextInt());
			System.out.println(ran3.nextBoolean());
		}
		
		// nextInt(bound) : 0 ~ n-1의 랜덤 정수를 생성
		for (int i = 0; i < 10; ++i) {
			System.out.println(ran3.nextInt(100)); // 0 ~ 99의 정수
		}
		
		// 원하는 범위의 랜덤 숫자를 생성하려면 빼기를 활용한다
		// (1) bound에 원하는 숫자의 개수를 입력한다
		// (2) 원하는 숫자 중 가장 작은수를 더하거나 빼서 원하는 범위를 만든다
		for (int i = 0; i < 10; ++i) {
			System.out.println(ran3.nextInt(10)); // 0 ~ 9
			System.out.println(ran3.nextInt(10) - 5); // -5 ~ 4
			System.out.println(ran3.nextInt(10) + 5); // 5 ~ 14
		}
		
		// 연습> 30 ~ 60의 랜덤 숫자 30개 생성해보기
		// random.nextInt(n+1) 범위가 n - 1 이기 때문에 +1 해준다
		for (int i = 0; i < 30; ++i) {
			System.out.println(ran3.nextInt(31) + 30);
		}
		
		// # Math.random() : 0 <= x < 1의 실수를 랜덤으로 생성한다
		for (int i = 0; i < 10; ++i) {
			System.out.println(Math.random());
		}
		
		/*
		 
		 	# Math.random()으로 원하는 범위의 정수 만들기
		 	
		 	(1) 원하는 숫자의 개수를 곱한다 (bound 역할)
		 	
		 	(2) 소수점 아래를 잘라 정수로 만든다
		 	
		 	(3) 더하거나 빼서 원하는 범위로 만든다
		 */
		
		// 20 ~ 49의 랜덤 정수 만들어보기
		for (int i = 0; i < 10; ++i) {
			System.out.println((int)(Math.random() * 30) + 20);
		}
	}

}
