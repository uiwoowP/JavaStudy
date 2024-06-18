package myobj.omok_answer;

public class Omok {
	
	final static char[] OMOK_CHARS = 
		{'┼', '┌', '┬', '┐', '├', '┤', '└', '┴', '┘', '╋', '●', '○'};
	
	final public static int BLACK_STONE = 10;
	final public static int WHITE_STONE = 11;
	
	final public static int BOARD_WIDTH = 15;
	final public static int BOARD_HEIGHT = 15;
	
	int[][] board;
	
	public Omok() {
		board = new int[][] {
			{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8}
		};
	}
	
	// 놓기 전에 진행하는 체크 (삼삼 같은 것..)
	public int preCheck(int x, int y, int stone) {
		return 0;
	}
	
	// 놓은 후에 진행하는 체크 (승리 여부)
	public int postCheck(int x, int y, int stone) {
		// 가로로 연속으로 놓여있는 돌의 개수를 세기
		
		int count = 0;
		// 방금 놓은 위치로부터 가로 오른쪽으로 가면서 같은 색상의 돌의 개수를 센다
		for (int i = x; i < BOARD_WIDTH; ++i) {
			if (board[y][i] == stone) {
				++count;
			} else {
				break;
			}
		}		
		// 왼쪽 (방금 놓은 위치 미포함)
		for (int i = x - 1; i >= 0; --i) {
			if (board[y][i] == stone) {
				++count;
			} else {
				break;
			}
		}		
		if (count == 5) {
			return 1; // 승리
		}
		
		count = 0;
		
		// 세로로 연속으로 놓여있는 돌의 개수를 세기
		for (int i = y; i < BOARD_HEIGHT; ++i) {
			if (board[i][x] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		for (int i = y - 1; y >= 0; --i) {
			if (board[i][x] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		if (count == 5) {
			return 1;
		}
		
		count = 0;
		
		for (int i = 0; i < BOARD_WIDTH; ++i) {
			int nx = x + i;
			int ny = y + i;
			
			System.out.printf("(%d, %d)\n", nx, ny);
			
			if (board[nx][ny] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		if (count == 5) {
			return 1;
		}
		
		count = 0;
		
		for (int i = 0; i < BOARD_HEIGHT; ++i) {
			int nx = x + i;
			int ny = y + i;
			
			System.out.printf("(%d, %d)\n", nx, ny);
			
			if (board[ny][nx] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		if (count == 5) {
			return 1;
		}
		
		return 0;
	}
	
	
	
	public boolean putBlack(int x, int y) {
		return putStone(x, y, BLACK_STONE);
	}
	
	public boolean putWhite(int x, int y) {
		return putStone(x, y, WHITE_STONE);
	}
	
	private boolean putStone(int x, int y, int stone) {
		if (x >= BOARD_WIDTH || x < 0 || y >= BOARD_HEIGHT || y < 0) {
			System.out.printf(
					"[SYSTEM] 그곳은 놓을 수 없는 위치입니다, (%d, %d)\n", x, y);
			return false;
		}
		
		int v = board[y][x];
		
		if (v != BLACK_STONE && v != WHITE_STONE) {
			board[y][x] = stone;
			return true;
		} else {
			System.out.printf(
					"[SYSTEM] 그곳은 이미 돌이 놓여있는 위치입니다, (%d, %d)\n", x, y);
			return false;
		}
	}

	public void printBoard() {
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				System.out.printf("%2c", OMOK_CHARS[board[i][j]]);
				
				
//				if (board[i][j] == 1) {
//					System.out.printf("%2c", '┌');
//				} else if (board[i][j] == 2) {
//					System.out.printf("%2c", '┬');
//				} else if (board[i][j] == 3) {
//					System.out.printf("%2c\n", '┐');
//				} else if (board[i][j] == 4) {
//					System.out.printf("%2c", '├');
//				} else if (board[i][j] == 0) {
//					System.out.printf("%2c", '┼');
//				} else if (board[i][j] == 5) {
//					System.out.printf("%2c\n", '┤');
//				} else if (board[i][j] == 9) {
//					System.out.printf("%2c", '╋');
//				} else if (board[i][j] == 6) {
//					System.out.printf("%2c", '└');
//				} else if (board[i][j] == 7) {
//					System.out.printf("%2c", '┴');
//				} else if (board[i][j] == 8) {
//					System.out.printf("%2c", '┘');
//				}
			}
			System.out.println();
		}
	}

}
