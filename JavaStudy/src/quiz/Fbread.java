package quiz;

public class Fbread {
	static String[] flavorNames = {"팥", "슈크림", "민트초코"};
	static int[] defaultPrices = {800, 1000, 1200};
	static String[] qualityNames = {"잘익음", "보통", "덜익음"};
	static int[] qualityPrices = {100, 0, -100};
	
	public final static int kindOfFlavors = flavorNames.length; 
	
	public int flavor;
	public int quality;
	int price;
	
	public Fbread() {
		flavor = (int)(Math.random() * flavorNames.length);
		quality = (int)(Math.random() * qualityNames.length);
		
	}
	
	public int getPrice() {
		return defaultPrices[flavor] + qualityPrices[quality];
	}
	
	// 붕어빵 관련 함수이므로 붕어빵 클래스 내부에 배치하면 나중에 찾기 편하다
	public static int getTotalPrice(Fbread[] breads) {
		int sum = 0;
		for (int i = 0; i < breads.length; ++i) {
			sum += breads[i].getPrice();
		}
		return sum;
	}

}
