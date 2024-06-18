package array;

public class ObjectCopy2 {
	/*
	 
	 	객체 배열의 요소에 저장된 값은 인스턴스 자체가 아니고
	 	인스턴스의 주소값입니다.
	 	
	 	결국 두 배열의 서로 다른 요소가 같은 인스턴스를 가리키고 있으므로 
	 	복사되는 배열의 인스턴스 값이 변경되면
	 	두 배열 모두 영향을 받는 것입니다.
	 	
	 	이와같이 주소값만 복사를 하는 것을 Shallow copy (얕은 복사) 라고 합니다.
	 
	 */
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정례");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=== bookArray1 ===");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=== bookArray2 ===");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}
}
