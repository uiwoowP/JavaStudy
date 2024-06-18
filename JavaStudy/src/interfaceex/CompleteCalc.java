package interfaceex;

public class CompleteCalc extends Calculator {
	
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}
	}
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public void description() {
		// 인터페이스에서 선언한 default 메서드를 클래스에서 오버라이딩하여 원하는 기능으로 변경가능
		super.description();
	}
	
	

}
