package quiz;

public class A02_Fee {
	public static void main(String[] arg) {
		
		String headline = "=";
		String underline = "-";
		String name = "임꺽정";
		// System.out.println() : 한 줄씩 화면에 출력
		System.out.println("            ####회비정보####");
		System.out.println("이름\t나이\t전화번호\t\t회비");
		for (int i = 0; i <= 40; i++) {
			System.out.print(headline);
		} 
		System.out.println();
		
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%s\t\"15\"\t010-123-1234\t₩20,000\n", name);
		}
		for (int i = 0; i <= 40; i++) {
			System.out.print(underline);
		}
		System.out.println();
		System.out.println("총합계\t\t\t\t₩100,000");
		for (int i = 0; i <= 40; i++) {
			System.out.print(headline);
		} 
		
		
		
	}
}
