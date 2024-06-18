package abstractex;

public abstract class AbstractTV {
	
	/*
	 
	 	이 클래스는 생성해서 사용할 목적이 아닌
	 	상속만을 위하여 만들어진 추상클래스 이므로 
	 	new 예약어로 인스턴스를 생성할 수 없다.
	 
	 */
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
