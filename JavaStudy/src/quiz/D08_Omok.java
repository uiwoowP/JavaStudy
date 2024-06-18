package quiz;

class Omok {
	public char[][] omok = {
			{'┌', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┐'},
			{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
			{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
			{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
			{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
			{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
			{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
			{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
			{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
			{'└', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┘'}
	};
	
	void draw() {
			
			for (int i = 0; i < omok.length; ++i) {
				for (int j = 0; j < omok[i].length; ++j) {
					System.out.printf("%2c", omok[i][j]);
				}
				System.out.println();
			}
	
	
}

class OmokPlayer {
	int num;
	char stone;
	
	
	public OmokPlayer(int num) {
		this.num = num;
		
		if (this.num == 1) {
			this.stone = '●';
		} else {
			this.stone = '○';
		}
	}
	
	void put(int x, int y) {		
		omok[x][y] = stone;
	}
	
	
		
	}

}


public class D08_Omok {
	// 오목을 만들어 주세요
	
	public static void main(String[] args) {
		// Hint - 콘솔에 판 그리는 방법
		
//		for (int i = 0; i < 10; ++i) {
//			for (int j = 0; j < 10; ++j) {
//				System.out.printf("%2c", '┼');
//			}
//			System.out.println();
//		}
		
		// Hint2 - 오목판에 돌 놓는 방법
	
		
		Omok omok = new Omok();

		
		while (true) {
			System.out.println("### 오목 ###");
			omok.draw();
			
			break;
		}
		
	}

}
