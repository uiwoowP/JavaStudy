package myobj;

public class FishBread {
	
	String taste;
	int price;
	String quality;
	
	final static int ran = (int)(Math.random() * 3);
	final static String[] menu = { "팥", "슈크림", "민트초코" };
	final static String[] qlt = {"상", "중", "하"};
	
	public FishBread() {
		this.taste = menu[ran];
		this.quality = qlt[ran];
		this.price = adjPrice(setPrice());
	}
		
	public int setPrice() {
		if (this.taste.equals("팥")) {
			price = 800;
		} else if (this.taste.equals("슈크림")) {
			price = 1000;
		} else if (this.taste.equals("민트초코")) {
			price = 1200;
		}
		return price;
	}
	
	public int adjPrice(int price) {
		if (this.quality.equals("상")) {
			price += 100;
		} else if (this.quality.equals("하")) {
			price -= 100;
		}
		return price;
	}
	
	public void info() {
		System.out.printf("붕어빵 %s 맛 %s 품질은 %d원 입니다.\n", taste, quality, price);
	}
	
	static void priceCal (FishBread[] fish) {
		int total = 0;
		for (int i = 0; i < fish.length; ++i) {
			total += fish[i].price;
		}
		
		System.out.printf("붕어빵의 총 가격은 %d 원 입니다", total);
	}
	
	
	public static void main(String[] args) {
		
		FishBread f1 = new FishBread();
		FishBread f2 = new FishBread();
		FishBread[] f100 = new FishBread[100];
		
		f1.info();
		f2.info();
		
		System.out.println();
		System.out.println("===============================");
		
		int redBean = 0;
		int cream = 0;
		int mintCho = 0;
		for (int i = 0; i < f100.length; ++i) {
			f100[i] = new FishBread();
			
			if (f100[i].taste.equals("팥")) {
				++redBean;
			} else if (f100[i].taste.equals("슈크림")) {
				++cream;
			} else if (f100[i].taste.equals("민트초코")) {
				++mintCho;
			}
			f100[i].info();
		}
		
		System.out.println("================================");
		System.out.println();
		System.out.printf("붕어빵100개중 팥:%2d개 슈크림:%2d개 민초맛:%2d개 입니다." , redBean, cream, mintCho);
		System.out.println();
		
		priceCal(f100);
		System.out.println();
	}
}


