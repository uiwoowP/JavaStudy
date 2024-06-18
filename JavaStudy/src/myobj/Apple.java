package myobj;

public class Apple {
	int price = 500;
	double weight = 3;
	
	// 이 생성자를 통해 만들어지는 사과 인스턴스들은 
	// 가격이 1000, 무게가 5가 된다
	// 나중에 실행되는 생성자의 값이 클래스의 변수에 덮어쓰기 되기 때문에
	// 위에 선언한 변수값이 아닌 생성자의 값이 출력됨
	
	
	// 이 생성자를 통해 만들어지는 인스턴스들은 가격이 1000, 무게가 5가 된다
	public Apple() {
		price = 1000;
		weight = 5;
	}
	
	// 이 생성자를 통해 만들어지는 인스턴스들은 가격은 받은걸로 채우고 무게는 10으로 설정하겠다
	public Apple(int price) {
		this.price = price;
		weight = 10;
	}
	
	// 이 생성자를 통해 만들어지는 인스턴스들은 가격은 1500원 무게는 받은걸로 채우겠다
	public Apple(double weight) {
		price = 1500;
		this.weight = weight;
	}
	
	// 이 생성자를 통해 만들어지는 인스턴스들은 두 변수의 값을 직접 설장하겠다
	public Apple(int price, double weight) {
		this.price = price;
		this.weight = weight;
	}
	
	public void print() {
		System.out.println("사과" + this + "의 가격: " + price);
		System.out.println("사과" + this + "의 무게: " + weight);
	}
}
