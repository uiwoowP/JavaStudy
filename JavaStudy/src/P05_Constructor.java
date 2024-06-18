
public class P05_Constructor {
	String name;
	float height;
	float weight;
	
	/*
	 
	  생성자가 없는 클래스는 클래스 파일을 컴파일 할 때
	  자바 컴파일러에서 자동으로 생성자를 만들어 줍니다.
	  이렇게 자동으로 만들어 주는 생성자를 디폴트 생성자 (default constructor)라고 합니다
	  
	  객체 지향 프로그램에서 메서드 이름이 같고 매개변수만 다른 경우를
	  '오버로드'라고 합니다.
	 
	 */
	public P05_Constructor() {} // 디폴트 생성자
	
	public P05_Constructor(String pname, float pheight, float pweight) {
		this.name = pname;
		this.height = pheight;
		this.weight = pweight;
	}
	
	public static void main(String[] args) {
		
		P05_Constructor person = new P05_Constructor();
	}
}
