package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	/*
	  
	  상위 클래스에서 선언한 멤버 변수나 메서드를 하위 클래스에서 참조 할 떄도
	  super 예약어를 사용할 수 있습니다
	  
	  오버라이딩을 하려면 반환형, 메서드 이름, 매개변수 개수, 매개변수 자료형이 반드시 같아야 합니다
	  
	 */
	
	
	
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int String int) 생성자 호출");
	}
	
	// @Override 어노테이션은 이 메서드가 재정의 된 매서드라는 것을
	// 컴파일러에 명확히 알려주는 역할을 함.
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	public int getAgentID( ) {
		return agentID;
	}
	
	public String showVIPInfo() {
		// 고객정보를 출력하는 showCustomerInfo() 메서드를 새로 구현하지 않고 활용
		return super.showCustomerInfo() + "담당 상담원의 아이디는" + agentID + "입니다";
	}
}
