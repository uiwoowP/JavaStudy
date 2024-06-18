
public class C06_Extend {
	
	/*
	 
	 	# 클래스 상속
	 	
	 	- 이미 만들어져 있는 클래스를 그대로 물려받아 사용하는 문법
	 	- 자식 클래스는 부모로부터 모든 변수와 메서드를 물려받아 그대로 가지고 있다
	 	- 자식 클래스는 부모로부터 물려받은 변수 및 기능을 
	 	  마음대로 고쳐서 사용할 수 있다 (오버라이드, Override)
	 	- 자식 클래스에는 부모 클래스에는 없는 기능을 새로 추가해서 사용할 수 있다
	 	- 상속시 자식 클래스에서는 반드시 부모 클래스의 생성자를 가장 먼저 호출해야 한다
	 	
	 	# super
	 	
	 	- 자식 클래스로 생성된 인스턴스의 부모 부분을 의미한다
	 	- 자식 클래스에서 this는 자식 클래스 자신만을 의미한다
	 	- 자식 클래스와 부모 클래스에서 같은 이름을 가지고 있는 자원을 구분하기 위해서 사용한다	
	 	- this()는 현재 클래스의 생성자를 의미하고 super()는 부모 클래스의 생성자를 의미한다
	 */
	
	public static void main(String[] args) {
//		Wolf w0 = new Wolf();
//		Wolf w1 = new Wolf("늑돌이");
//		Wolf w2 = new Wolf("늑순이");
//		
//		w0.pet();
//		w1.pet();
//		w2.pet();
		
		// Wolf 클래스를 상속받은 Dog 클래스에 Wolf의 기능이 그대로 들어있다
//		Dog d1 = new Dog();
//		
//		d1.pet();
//		d1.run();
		
		Airplane air0 = new Airplane();
		B52 b52 = new B52();
		KoreanAir kAir = new KoreanAir();
		
		air0.fly();
		b52.fly();
		kAir.fly();
		System.out.println("--------------------");
		b52.fastFlying();
		kAir.takePassenger();
		System.out.println("--------------------");
		air0.fix();
		b52.fix();
		kAir.fix();
		
	}
}

class Wolf {
	String name;
	int age = 0;
	
	public Wolf() {
		name = "이름없는 늑대";
	}
	
	public Wolf(String name) {
		this.name = name;
	}
	
	void pet() {
		System.out.printf("늑대(%s, %d세)를 쓰다듬다가 손이 물렸습니다. \n", 
				this.name, this.age);
	}
	void run() {
		System.out.printf("%s가 열심히 달립니다!\n", this.name);
	}
}

class Dog extends Wolf {
	
	int walkDesire = 100;
	String socialId;
	
	public Dog() {
		super("이름없는개");
	}
	
	public Dog(String name) {
		super(name);
	}
	
	public Dog(String name, String socialID) {
		super(name);
		this.socialId = socialID;
	}
	
	// 부모 클래스에 있는 똑같은 이름의 메서드를 자식 클래스에 만들 수 있다
	void pet() {
		System.out.printf("강아지 (%s, %d세)를 쓰다듬어 줬더니 아주 좋아합니다. \n",
				this.name, this.age);
	}
	
	void walk() {
		System.out.printf("강아지 (%s, %d세)와 함께 산책했습니다! \n",
				this.name, this.age);
		walkDesire -= 10;
	}
	
	@Override
	public String toString() {
		return "강아지(" + name + "/" + age + "세)";
	}
	
	// Object 타입에서 Dog타입으로 다운캐스팅을 해야 socialId 사용가능
	// Object 타입의 범용성 때문에 다운캐스팅시 주의해야함
	@Override
	public boolean equals(Object obj) {
		// instanceof 추가하여 다른 타입 입력시 false 값을 리턴
		if (!(obj instanceof Dog)) {
			return false;
		}
		return this.socialId.equals(((Dog)obj).socialId);
	}
	
	@Override
	public int hashCode() {
		// String은 hashCode() 메서드를 오버라이드 해놓은 클래스다
		return socialId.hashCode(); 
	}
	
}
/*
	상속 관계에 있는 클래스의 예시를 한번 작성해 보세요
*/

class Building {
	double progress;

	void build() {
		progress += 5.5;
	}
}

class PurchaseBuilding extends Building {
	// 상속받은 자식 클래스는 반드시 부모의 생성자인 super()를 먼저 호출해야 한다
	// 하지만, 기본 생성자는 생략이 가능하기 때문에 안적는것처럼 보이는 경우도 있다
	public PurchaseBuilding() {
		super();
	}
	
	void purchase() {}
	void sell() {}
}

class UpgradeBuilding extends Building {
	void upgrade() {}
}

class CreationBuilding extends Building {
	void create() {}
}

class Airplane {
	String name;
	int weight;
	int age;
	
	public Airplane() {
		this.name = "그냥 비행기";
	}
	
	void fly() {
		System.out.printf("비행기 %s가 하늘을 납니다. \n",
				this.name);
	}
	
	void fix() {
		System.out.printf("비행기 %s를 수리합니다. \n",
				this.name);
	}
}

class B52 extends Airplane {
	
	public B52() {
		this.name = "B52";
	}
	
	void fastFlying() {
		System.out.printf("전투기 %s가 하늘을 빠르게 납니다. \n",
				this.name);
	}
	
}

class KoreanAir extends Airplane {
	int passengerNum;
	
	public KoreanAir() {
		this.name = "대한항공 여객기";
	}
	
	void takePassenger() {
		passengerNum += 10;
		System.out.printf("비행기 %s의 현재 탑승객의 수는 %d 입니다.\n",
				this.name, this.passengerNum);
	}
}
