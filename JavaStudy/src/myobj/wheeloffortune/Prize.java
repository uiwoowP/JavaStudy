package myobj.wheeloffortune;

public class Prize {
	public String name;
	public int value;
	public int amount;
	public int chance;
	public int chanceOnWheel;
	
	public Prize(String name, int value, int amount, int chance) {
		this.name = name;
		this.value = value;
		this.amount = amount;
		this.chance = chance;
		this.chanceOnWheel = convertChance();
	}
	
	public int convertChance() {
		return (int)Math.round(((360 * this.chance * 0.01) * 100) / 100);
	}
	
	void Info() {
		System.out.printf("상품 %s\n가치 %d원\n남은수량 %d\n당첨확률 %d\n",
				name, value, amount, chance);
	}
	
	public static void main(String[] args) {
		
		
	}
}
