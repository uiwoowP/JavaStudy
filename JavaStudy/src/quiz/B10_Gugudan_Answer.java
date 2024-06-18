package quiz;

public class B10_Gugudan_Answer {
	
	public static void main(String[] args) {
		
		for (int dan = 2; dan <=9; ++dan) {
			System.out.print(dan + "단: ");
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%02d ", dan, gop, dan * gop);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int gop = 0; gop <= 9; ++gop) {
			for (int dan = 2; dan <= 9; ++dan) {
				if (gop == 0) {
					System.out.print(dan + "단\t\t");
				} else {
				System.out.printf("%d x %d = %d\t", dan, gop, dan * gop);
				}
			}
			System.out.println();
		}
	}

}
