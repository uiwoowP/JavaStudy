
public class P05_Class {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	int num1 = 10;
	int num2 = 20;
	
	public void showStudnetInfo() {
		System.out.println(studentName + "," + address);
	}
	
	int getTenTotal() {
		int i;
		int total = 0;
		for(i = 1; i <= 10; i++) {
			total += i;
		}
		return total;
	}
	
	void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다");
			return;
		} else {
			int result = num1 / num2;
			System.out.println(num1+ "/" + num2 + "=" + result + "입니다.");
		}
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	int sum = add(num1, num2);
	
	
}
