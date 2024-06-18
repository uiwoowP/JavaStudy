package myobj;

public class GlassWindow {
	int size;
	String frame;
	String shape;
	String color;
	int price;
	
	static String material = "Glass";
	
	public GlassWindow(int size, String frame, String shape, String color) {
		this.size = size;
		this.frame = frame;
		this.shape = shape;
		this.color = color;
	}
	
	public void info() {
		System.out.printf("%s 모양과 %s 재질의 %s색 창문의 사이즈는 %d이고 모두 %s창문 입니다.\n", 
				shape, frame, color, size, material);
	}
	
	public void printPrice() {
		System.out.printf("이 창문의 가격은 %d원 입니다\n", price);
	}
	
	public static void main(String[] args) {
		
		GlassWindow win1 = new GlassWindow(50, "Metal", "Round", "Green");
		GlassWindow win2 = new GlassWindow(30, "Wood", "Square", "Yellow");
		GlassWindow win3 = new GlassWindow(100, "Stone", "Triangle", "Pink");
		GlassWindow win4 = new GlassWindow(120, "Sand", "Hexagon", "Red");
		
		win1.price = 50000;
		win2.price = 15000;
		win3.price = 35000;
		win4.price = 77000;

		win1.info();
		win2.info();
		win3.info();
		win4.info();
		
		System.out.println();
		
		win1.printPrice();
		win2.printPrice();
		win3.printPrice();
		win4.printPrice();

	}
	
}

