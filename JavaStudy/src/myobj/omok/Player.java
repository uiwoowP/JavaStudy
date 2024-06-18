package myobj.omok;

public class Player {
	int num;
	char stone;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setStone() {
		if (this.num == 1) {
			this.stone = '●';
		} else if (this.num == 2) {
			this.stone = '○';
		} else {
			System.out.println("숫자를 다시 입력해 주세요");
		}
	}
	
	
}
