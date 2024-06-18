package array;

public class ArrayCopy {
	public static void main(String[] args) {
		int [] array1 = {10, 20, 30, 40, 50};
		int [] array2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(array1, 0, array2, 1, 4); // args(복사할 배열, 복사할 배열위치, 대상 배열, 붙여넣을 위치, 복사할 요소갯수)
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
	}

}
