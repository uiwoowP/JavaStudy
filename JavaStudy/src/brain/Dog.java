package brain;

public class Dog {
	String name;
	int age;
	
	public Dog(String n) {
		name = n;
		age = 0;
	}
	
	// Birthday() 함수는 Stepper의 역할을 수행
	public void birthday() {
		age++;
	}

}
