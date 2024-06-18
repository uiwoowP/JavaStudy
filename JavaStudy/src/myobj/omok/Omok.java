package myobj.omok;

public class Omok {
	public char[][] board = {
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

		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				System.out.printf("%2c", board[i][j]);
			}
			System.out.println();
		}
	}

	void update(int x, int y, char c) {
		board[x][y] = c;
	}
	
	void reset() {
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board.length; ++j) {
				board[i][j] = ' ';
			}
		}
	}
	
	private boolean checkLine(int x, int y, int dx, int dy, char stone) {
		
		for (int i = -2; i <= 2; ++i) {
			int nx = x + i * dx;
			int ny = y + i * dy;
			
			if (!isInRange(nx, ny) || board[nx][ny] != stone) {
				return false;
			}
		}
		
		return true;
	}
	
	private boolean isInRange(int x, int y) {
		return x >= 0 && x < board.length && y >= 0 && y < board[0].length;
	}

	
	public boolean isWin(int x, int y, char stone) {
		if (checkLine(x, y, 0, 1, stone)) {
			return true;
		}
		
		if (checkLine(x, y, 1, 0, stone)) {
			return true;
		}
		
		if (checkLine(x, y, 1, 1, stone) || checkLine(x, y, 1, -1, stone)) {
			return true;
		}
		
		return false;
	}

//	void check(int x, int y, char stone) {
//		int winCnt = 0;
//		
//		if (x - 2 < 0 ) {
//			x = 0;
//		} else if (y - 2 < 0) {
//			y = 0;
//		} else if (x + 2 > board.length) {
//			x = board.length;
//		} else if (y + 2 > board[0].length) {
//			y = board.length;
//		} else {
//			for (int i = x - 2; i <= x + 2; ++i) {
//				if (board[x][i] == stone) {
//					winCnt++;
//				}
//				
//			for (int j = y - 2; j <= y + 2; ++j) {
//				if (board[i][j] == stone) {
//					winCnt++;
//				} else {
//					winCnt = 0;
//				}
//				
//				System.out.printf("(%d, %d) ", i, j);
//				System.out.print("[" + winCnt + "] ");
//			}
//			System.out.println();
//			}
//			
//		}
//		
//	}
	
}
