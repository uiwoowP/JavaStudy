package singleton;

public class Company {
	
	/*
	  디폴트 생성자는 항상 public 이므로
	  private 접근 제어자를 가진 생성자를 생성해줍니다.
	 */
	
	private static Company instance = new Company(); // 프로그램 전체에 사용할 유일한 인스턴스
	
	private Company() {}
	
	// 인스턴스를 외부에서 참조할 수 있도록 public get()메서드 구현
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance; // 유일하게 생성하는 인스턴스 반환
	}

}
