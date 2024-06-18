package inheritance;

public class OverridingTest2 {
	
	/*
	 
	   멤버 변수와 메서드는 선언한 클래스형에 따라 호출됩니다.
	   하지만 아래의 코드의 출력결과는 9000원으로 VIPCustomer 인스턴스의 메서드가 호출되었습니다.
	   
	   상속에서 상위크래스와 하위클래스에 같은 이름의 메서드가 존재할 때
	   호출되는 메서드는 인스턴스에 따라 결정됩니다.
	   
	   선언한 클래스 형이 아닌 생성된 인스턴스의 메서드를 호출하는 것입니다.
	   
	   이렇게 인스턴스가 호출되는 기술을 Virtual Method 라고 합니다.
	 
	 */
	
	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은"
				+ vc.calcPrice(10000) + "원입니다.");
	}

}
