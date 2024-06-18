import java.util.Scanner;

public class P05_Order {
	String orderNumber;
	String userId;
	String date;
	String userName;
	String orderNum;
	String address;
	
	public void getOrder() {
		
		System.out.println("주문정보를 수집하겠습니다.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문 번호를 입력해 주세요");
		orderNumber = sc.next();
		System.out.println("아이디를 입력해 주세요");
		userId = sc.next();
		System.out.println("날짜를 입력해 주세요");
		date = sc.next();
		System.out.println("사용자 이름을 입력해 주세요");
		userName = sc.next();
		System.out.println("주문 번호를 입력해 주세요");
		orderNum = sc.next();
		System.out.println("주소를 입력 해 주세요");
		address = sc.next();
		
	}
	
	public static void main(String[] args) {
		
		P05_Order order = new P05_Order();
		
		order.getOrder();
		
		System.out.printf("주문 번호 : %s\n", order.orderNumber);
		System.out.printf("주문자 아이디 : %s\n", order.userId);
		System.out.printf("주문 날짜 : %s\n", order.date);
		System.out.printf("주문자 이름 : %s\n", order.userName);
		System.out.printf("주문 상품 번호 : %s\n", order.orderNum);
		System.out.printf("배송 주소 : %s\n", order.address);
		
	}
	

}
