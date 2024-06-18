package quiz;

public class B13_Lotto_Answer1 {
	
	public static void main(String[] args) {
		
		int [] lotto = new int [7];
		
		for (int i = 0; i < lotto.length; ++i) {
			int num = (int)((Math.random() * 45) + 1);
			
			if (i != 0) {
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			
		}
		System.out.println();
		
	}
}
