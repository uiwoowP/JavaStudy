package quiz;

//public class C09_PrizeDraw {
//	
//	
//	
//	/*
//	 
//	 	# 돌림판을 돌려서 경품을 추첨하는 프로그램을 만들어보세요.
//	 	
//	 	1. 경품들은 경품의 보유 가치와 한정된 수량이 있다
//	 	
//	 	2. 돌림판 인스턴스를 생성한 후 돌림판에 여러 종류의 경품을 추가할 수 있어야 한다
//	 	
//	 	3. 돌림판 인스턴스에 추가되어 있는 경품들의 당첨 확률을 수정할 수 있어야 한다
//	 	
//	 	4. 만약 수량이 모두 소진된 상품에 걸린다면 돌림판을 다시 돌린다
//	 	
//	 */
//	
//	int[] win = new int[360];
//	
//	String[] prizeName = new String[5];
//	int[] prizeValues = new int[5];
//	int[] prizeQty = new int[5];
//	
//
//
//	
//	
//		
//	
//	/**
//	  
//	   @return - 1: 꽝, - 2: 돌림판 당첨되었지만 수량소진, 그 외: 당첨된 상품번호
//	 */
//	public int draw() {
//		int prizeNum = win[(int)(Math.random() * win.length)];
//		
//		if (prizeNum != -1) {
//			return -1;
//		} else if (prizeQty[prizeNum] = 0) {
//			return -2;
//		}
//		
//		--prizeQty[prizeNum];
//		
//		return prizeNum;
//	}
//	
//	public void printPrizeIndo(int prizeNum) {
//		System.out.printf("%d원 상당의 %s [남은수량:%d, 당첨확률: %.2f%%]\n",
//				prizeValues[prizeIndex],
//				prizeNames[prizeIndex],
//				prizeQty[prizeIndex],
//				prizeDegree[prizeNum] / (double)win.length * 100);
//	}
//	
//	public void addPrize () {
//		prizeNames[currPrizeIndex] = name;
//		prizeValue[currPrizeIndex] = value;
//		prizeQty[currPrizeIndex] = qty;
//		prizeDegree[currPrizeIndex] = degree;
//		
//		++currPrizeIndex;
//		
//	}
//	
//	public static void main(String[] args) {
//		
//	
//		PrizeWheel wheel = new PrizeWheel();
//		
//		wheel.addPrize("선풍기", 35000, 35, 20);
//		wheel.addPrize("세탁기", 2000000, 10, 5);
//		wheel.addPrize("츄파춥스", 100, 5000, 100);
//		
//		for (int i = 0; i < 100; ++i) {
//			int prizeNum;
//			switch (wheel.draw()) {
//			case -1:
//				System.out.println("꽝입니다!");
//			case -2:
//				System.out.println("당첨되었지만 수량이 모두 소진되었습니다! "
//						+ "기회가 한번 더 주어집니다!");
//				
//				break;
//			default:
//				wheel.printPrizeInfo(prizeNum);
//				break;
//			}
//		}
//	}
//}


