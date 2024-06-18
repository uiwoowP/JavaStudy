package example;

public class Orange {
	int price;
	int sweet;
	
	public Orange() {
		this(1000, 8); // this() 현재 인스턴스의 다른 생성자를 호출
	}
	
	public Orange(int price, int sweet) {
		this.price = price;
		this.sweet = sweet;
	}
	
	public void print() {
		System.out.printf("가격: %d, 당도: %d\n",
				price, sweet);
	}
	
	public static void main(String[] args) {
		Orange o1 = new Orange();
		Orange o2 = new Orange(800, 9);
		o1.print();
		o2.print();
		System.out.println();
		RedOrange ro1 = new RedOrange();
		
		ro1.print();
		
	}
}
