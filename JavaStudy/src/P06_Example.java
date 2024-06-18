
public class P06_Example {
	
	/*
	  스택 메모리와 힙 메모리의 주요 차이점
	  
	  - 스택은 선형 데이터 두조인 반면 힙은 계층 구조 입니다.
	  - 스택 메모리는 결코 조각화 되지 않는 반면,
	    힙 메모리는 메모리 블록이 먼저 할당된 다음 
	    해제됨에 따라 조각화 될 수 있습니다.
	  - 스택은 지역 변수에만 엑세스 하는 반면
	    힙은 변수에 전역적으로 엑세스 할 수 있습니다.
	  - 스택 변수는 크기를 조정할 수 없지만
	    힙 변수는 크기를 조정할 수 있습니다.
	    
	 */
	
	public static void main(String[] args) {
		P06_This bDay = new P06_This();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}

}
