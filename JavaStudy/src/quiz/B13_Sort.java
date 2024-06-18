package quiz;

public class B13_Sort {
	/*
	  		char temp = arr[0];
			arr[0] = arr[randomIndex];
			arr[randomIndex] = temp; 
	 */
	
	public static void main(String[] args) {
		
		int[] arr = new int[30];
		
		for (int i = 0; i < arr.length; ++i) {
			int num = (int)(Math.random() * 1000 + 1);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		int[] newArr = arr.clone();
		
		for (int i = 0; i < newArr.length - 1; ++i) {
			boolean chagned = false;
			for (int j = 0; j < newArr.length - 1 - i; j++) {
				
				// 
				if (newArr[j] > newArr[j + 1]) {
					int temp = newArr[j];
					newArr[j] = newArr[j + 1];
					newArr[j + 1] = temp;
					chagned = true;
				}
			}
			
			if (!chagned) {
				break;
			}
			
			for (int k = 0; k < newArr.length; k++) {
				System.out.print(newArr[k] + " ");
			}
			System.out.println();
		}
	}
}
