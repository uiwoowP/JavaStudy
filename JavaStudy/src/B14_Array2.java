import java.util.Arrays;

public class B14_Array2 {
	
	/*
	 	
	 	배열도 다른 배열의 요소가 될 수 있다
	 	(배열 안에 여러개의 배열이 들어있을 수도 있다)
	 */
	
	public static void main(String[] args) {
		// int를 요소로 가지는 int[]
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1};
		int[] arr3 = new int[8];
		int[] arr4 = new int[] {10, 11, 12, 13};
		
		// int[]를 요소로 가지는 int[][] 2차원 배열
		int [][] arr5 = {{1, 2, 3}, {3, 3, 3, 3}, {5, 5, 5, 1},
				arr1,
				arr2,
				arr3,
				arr4,};
		
		// int[]의 값을 인덱스를 통해 꺼내면 int가 나온다
		System.out.println(arr1[3]);
		
		// int[][]의 값을 인덱스를 통해 꺼내면 int[]이 나온다
		System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		
		System.out.println(arr5[0][2]);
		System.out.println(arr5[3][2]);
		System.out.println(arr5[3][5]);
		
		// 배열의 변수명으로 값을 전달하는 것은
		// 해당 변수명이 가리키고 있는 실체(배열)의 위치를 전달하는 것이다
		// 아래 예저에서 javaClass의 실체는 하나이기 때문에
		// school[0][0]을 변경하면 school[0]과 javaClass가 함께 가리키고 있는
		// 같은 실체를 변경하게 된다
		int[] javaClass = {30, 44, 70, 99, 80};
		int[] pythonClass = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int[][] school = {javaClass, pythonClass};
		
		school[0][0] = -5;
		
		System.out.println("javaClass[0]=" + javaClass[0]);
		
		// # 배열이 다른 변수와 다른점
		
		// - 배열타입 변수에는 실제 배열의 메모리상 위치(주소값)이 들어있고
		//   인덱스를 통해 해당 주소를 찾아가는 방식을 사용한다
		// - 기본형 변수(소문자로 시작하는 변수)는 변수에 그냥 값을 넣고 사용한다
		
		int num1 = 10;
		int num2 = num1;
		
		num2 = 99;
		
		System.out.println(num1);

		int[] scores1 = {1, 2, 3, 4, 5};
		int[] scores2 = scores1;
		
		System.out.print(Arrays.toString(scores2));
		
		scores2[0] = 99;
		
		System.out.println(Arrays.toString(scores1));
		
		// n차원 배열은 n중 반복문으로 모든 요소를 탐색할 수 있다
		char[][] negativeMessages = {
				{'H', 'e', 'l', 'l'},
				{'G', 'u', 'i', 'l', 't', 'y'},
				{'D', 'i', 's', 'a', 's', 't', 'e', 'r'},
				{'S', 't', 'u', 'p', 'i', 'd'}
		};
		
		char[][] positiveMessages = {
				{'F', 'r', 'i', 'e', 'n', 'd', 's', 'h', 'i', 'p'},
				{'H', 'a', 'p', 'p', 'y'},
				{'P', 'e', 'r', 'f', 'e', 'c', 't'},
				{'N', 'i', 'c', 'e'},
				{'G', 'o', 'o', 'd'}
		};
		
		// <연습> : messages를 반복문으로 한 글자씩 출력해보세요
		char[][][] messages = {negativeMessages, positiveMessages};
		
		for (int i = 0; i < negativeMessages.length; ++i) {
			for (int j = 0; j < negativeMessages[i].length; ++j) {
				System.out.printf("[%d][%d]: %c\n", i, j, negativeMessages[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < messages.length; ++i) {
			for (int j = 0; j < messages[i].length; ++j) {
				for (int k = 0; k < messages[i][j].length; ++k) {
					System.out.print(messages[i][j][k] + " ");
					System.out.printf("[%d][%d][%d]: %c\n", i, j, k, messages[i][j][k]);
				}
			}
		}
		
	}

}
