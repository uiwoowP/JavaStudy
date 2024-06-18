package quiz;
import java.util.Arrays;
import java.util.Random;

public class B13_Sort_Answer {
	
	/*
	 * https://gmlwjd9405.github.io/2018/05/06/algorithm-bubble-sort.html
	 */
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] numbers = new int[7];
		
		for (int i = 0; i < numbers.length; ++i) {
			numbers[i] = ran.nextInt(1000) + 1;
		}
		System.out.println("원본: " + Arrays.toString(numbers));
		
		/*
		 	1. 제일 작은 수를 찾는다
		 	2. 맨 앞에 넣는다
		 	3. 위의 과정을 배열의 길이 만큼 반복한다
		 */
		int[] sorted1 = new int[numbers.length];
		
		// sorted1번에 원본의 값을 그대로 복사한다
		for (int i = 0; i < sorted1.length - 1; ++i) {
			sorted1[i] = numbers[i];
		}
		
		// 원본을 보존한채로 sorted1번으로 정렬을 진행한다
		for (int i = 0; i < numbers.length; ++i) {
			
			// 제일 작은 값과 제일 작은 값이 있던 위치를 찾는다
			int min = sorted1[i];
			int min_index = i;
			
			for (int j = i + 1; j < numbers.length; ++j) {
				if (min > sorted1[j]) {
					min = sorted1[j];
					min_index = j;
				}
			}
			
			// i번째 값과 찾아낸 제일 작은 값을 교환한다
			int temp = sorted1[i];
			sorted1[i] = sorted1[min_index];
			sorted1[min_index] = temp;
			
			System.out.printf("%d번째 정렬 진행후: %s\n", i, Arrays.toString(sorted1));
			
		}
		System.out.println();
		/*
		 	1. 맨 앞의 값을 계속 교환하며 제일 큰 값을 맨 뒤로 보낸다
		 	2. 위의 과정을 len - 1번 반복한다
		 */
		
		// Arrays.copyOf(원본배열, 길이) : 전달한 원본 배열의 복사본을 반환한다
		int[] sorted2 = Arrays.copyOf(numbers, numbers.length);
		
		for (int i = 0; i < sorted2.length - 1; ++i) {
			for (int j = 0; j < sorted2.length - 1 - i; ++j) {
				int a = j;
				int b = j + 1;
				
				if (sorted2[a] > sorted2[b]) {
					int temp = sorted2[a];
					sorted2[a] = sorted2[b];
					sorted2[b] = temp;
					
				}
			}
			System.out.printf("%d번째 정렬 후: %s\n", i, Arrays.toString(sorted2));
		}
		
	}

}
