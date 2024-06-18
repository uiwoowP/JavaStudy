package array;

public class EnhancedForLoop {
	
	/*
	 
	 	배열의 처음부터 끝까지 for (변수 : 배열) 을 사용해서
	 	배열의 요소 값을 순서대로 하나씩 가져와서 변수에 대입하는 것이 가능
	 
	 */
	
	public static void main(String[] args) {
		String [] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for (String lang : strArray) {
			System.out.println(lang);
		}
	}

}
