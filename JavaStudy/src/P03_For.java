
public class P03_For {
	public static void main(String[] args) {
		int i;
		String hello = "안녕하세요";
		int num = 1;
		
		
		// 변수의 초기화식은 생략이 가능하다
		for (i = 0; i <= 10; i++) {
			
			if (num == 11) {
				break;
			} else {
				System.out.printf("%s%d \n", hello, num);			
				num = ++num;
				
			}
			
		}
		
	}
}
