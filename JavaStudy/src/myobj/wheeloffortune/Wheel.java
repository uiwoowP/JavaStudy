package myobj.wheeloffortune;

import java.util.Arrays;

public class Wheel {
	int turn;
	int numItem = 6;
	Prize[] items = new Prize[numItem];
	int[] wheel = new int[360];
	
	Prize p1 = new Prize("화장지", 1000, 50, 55);
	Prize p2 = new Prize("생수", 2000, 10, 25);
	Prize p3 = new Prize("낯선 초상화", 3000, 5, 10);
	Prize p4 = new Prize("비빔밥용 돌솥", 5000, 3, 7);
	Prize p5 = new Prize("싱싱한 고등어", 7500, 2, 2);
	Prize p6 = new Prize("고급진 황금빛 무", 12000, 1, 1);
	
	Wheel() {
		this.items[0] = p1;
		this.items[1] = p2;
		this.items[2] = p3;
		this.items[3] = p4;
		this.items[4] = p5;
		this.items[5] = p6;
	}
	
	
	void setWheel() {

		int fillNum = 1;
		int idx = 0;
		for (int i = 0; i < items.length; ++i) {
			System.out.println(idx);
			if (idx == 0) {
				for (int j = idx; j < items[i].chanceOnWheel; ++j) {
					wheel[j] = fillNum;
				}
				++fillNum;
			} else if (idx > 0) {
				idx += items[i].chanceOnWheel;
				System.out.println(idx);
				
				for (int j = idx; j < items[i].chanceOnWheel + idx; ++j) {
					wheel[j] = fillNum;
				}
				++fillNum;
			}
			Arrays.sort(wheel);
		}
	}
	
	void stop() {
		int stop = (int)(Math.random() * 360);
		System.out.println(stop);
		System.out.println(wheel[stop]);
		switch (wheel[stop]) {
		case 1: 
			System.out.println("*" + items[0].name + " 당첨!!");
			System.out.println("아주 많이 축하합니다");
			System.out.println("----------------------------");
			items[0].Info();
			items[0].amount--;
			break;
		case 2:
			System.out.println("**" + items[1].name + " 당첨!!");
			System.out.println("적당히 축하드립니다");
			System.out.println("----------------------------");
			items[1].Info();
			items[1].amount--;
			break;
		case 3:
			System.out.println("***" + items[2].name + " 당첨!!");
			System.out.println("축하드려요");
			System.out.println("----------------------------");
			items[2].Info();
			items[2].amount--;
			break;
		case 4:
			System.out.println("****" + items[3].name + " 당첨!!");
			System.out.println("축하..합니다");
			System.out.println("----------------------------");
			items[3].Info();
			items[3].amount--;
			break;
		case 5:
			System.out.println("*****" + items[4].name + " 당첨!!");
			System.out.println("운이 좋으시네요");
			System.out.println("----------------------------");
			items[4].Info();
			items[4].amount--;
			break;
		case 6:
			System.out.println("******" + items[5].name + "당첨!!");
			System.out.println("가장 좋은 상품입니다!");
			System.out.println("----------------------------");
			items[5].Info();
			items[5].amount--;
			break;
		}
		
	}
	
	public static void main(String[] args) {
		Wheel whl = new Wheel();
		
		whl.setWheel();
		
		System.out.println(Arrays.toString(whl.wheel));
		
		whl.stop();
		
	}
}
