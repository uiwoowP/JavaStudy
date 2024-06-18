package quiz;
import java.util.Arrays;

public class B13_Sort_Me {
	
	/*
	 
	 	1 ~ 1000 사이의 랜덤 종수 값이 30개 들어있는  배열을 하나 생성한 후
	 	해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 만들어 원본과 함께 출력해주세요
	 	
	 */
	
	public static void main(String[] args) {
		
		int[] arr = new int[30];
		
		for (int i = 0; i < arr.length; ++i) {
			int num = (int)(Math.random() * 1000 + 1);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr2.length; ++i) {
			System.out.print(arr2[i] + " ");
		}
	}
}
