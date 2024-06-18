
/*
 
 */


public class P03_DoWhile {
	
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while (num <= 100);
		
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다");
	}

}
