package myobj;

public class FishBreadCalculator {
	
	public void priceCal (FishBread[] fish) {
		int total = 0;
		for (int i = 0; i < fish.length; ++i) {
			total += fish[i].price;
		}
		
		System.out.printf("붕어빵의 총 가격은 %d 원 입니다", total);
	}
}