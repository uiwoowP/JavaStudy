package array;

public class ObjectCopy3 {
	
	/*
	 	
	 	인스턴스를 따로 관리하고 싶다면
	 	직접 인스턴스를 만들고 그 값을 복사합니다. 이를 Deep copy라고 합니다.
	 	
	 	복사할 배열에 인스턴스를 따로 생성한 후 요소 값을 복사합니다.
	 	이렇게 하면 복사한 배열 요소는 기존 배열 요소오 ㅏ서로 다른 인스턴스를 가리키므로
	 	기존 배열의 요소값이 변경되어도 영향을 받지 않는다는 것을 알 수 있습니다.
	 
	 */
	
	public static void main(String[] args) {
		Book [] bookArray1 = new Book[3];
		Book [] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정례");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("==== bookArray1 ====");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("==== bookArray2 ====");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
