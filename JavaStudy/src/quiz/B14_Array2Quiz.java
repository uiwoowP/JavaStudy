package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {
	
	public static void main(String[] args) {
		
		int[][] myArr = {
				new int[5],
				new int[7],
				new int[3],
				new int[10],
				{1, 1, 1, 1}
		};
		
		// 1. myArr의 모든 닶을 100 ~ 200 사이의 랜덤 정수로 바꾸기
		
		// 2. 랜덤으로 바뀐 모든 값의 총합과 평균을 구하기
		
		// 3. 각 행(row)의 합을 구해서 출력하기
		
		// 4. 각 열(col)의 합을 구해서 출력하기
		
		
		// 1.
		int cnt = 0;
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				int num = (int)(Math.random() * 101 + 100);
				myArr[i][j] = num;
				System.out.printf("[%d][%d] = %d \n", i, j, num);
				++cnt;
			}
			System.out.println();
		}
		System.out.println();
		
		// 2.
		int total = 0;
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				total += myArr[i][j];
			}
		}
		System.out.printf("모든 값의 총 합은 %d 이고, 평균은 %d 입니다.", total, total/cnt);
		
		System.out.println();
		System.out.println();

		// 3.
		int[] rowTotal = new int[myArr.length];
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				
				if (i < myArr.length) {
					rowTotal[i] += myArr[i][j];
				}
			}
			System.out.printf("- 행 %d 의 총 합은 %d 입니다. \n", i + 1, rowTotal[i]);
		}
		
		System.out.println();
		
		// 4.
		
		int maxCol = 0;
		for (int i = 0; i < myArr.length; ++i) {
			maxCol = maxCol < myArr[i].length ? myArr[i].length : maxCol;
		}
		
		int[] colTotal = new int[maxCol];

		for (int i = 0; i < myArr.length; ++i) {
			int c = 0;
			for (int j = 0; j < myArr[i].length; ++j) {
				colTotal[i] += myArr[i][c];
			}
			++c;
		}
		
		for (int i = 0; i < colTotal.length; ++i) {
			
			System.out.printf("|열 %d 의 총 합은 %d 입니다. \n", i + 1, colTotal[i]);
			
		}
	}
}
