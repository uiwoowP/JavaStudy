import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class D06_Collections {
	/*
	 
	 	# java.util.Arrays
	 	
	 	- 배열을 편하게 다룰 수 있는 기능들이 모여있는 클래스
	 	
	 	# java.util.Collections
	 	
	 	- 컬렉션들을 편하게 다룰 수 있는 기능들이 모여있는 크랠스
	 
	 */
	
	public static void main(String[] args) {
		// Arrays.asList(배열) : 전달한 배열을 리스트로 만들어 반환한다
		// 이 메서드로 만든 리스트는 기능들이 미구현 상태이다.
		List<Integer> list = 
				new LinkedList<>(Arrays.asList(new Integer[] {10, 10, 10, 10, 11, 12}));
		
		list.add(3, 33);
		
		System.out.println(list);
		
		// Arrays.copyOf(origin, length) : 해당 배열의 복사본을 만들어 반환한다.
		String[] zoo = { "사자", "코끼리", "판다", "악어", "돌고래" };
		String[] subZoo = Arrays.copyOf(zoo, 3);
		
		// Arrays.toString(arr) : 배열을 보기좋은 문자열로 만들어 반환한다.
		System.out.println(Arrays.toString(subZoo));
		
		// Arrays.sort(arr) : 전달한 배열의 내용을 크기순으로 정렬해준다.
		// 정렬된 새 인스턴스를 만들어주는 것이 아니라 원본을 정렬해버리므로 주의해아 한다.
		Arrays.sort(zoo);
		
		System.out.println(Arrays.toString(zoo));
		
		// Arrays.fill(arr, value) : 배열의 모든 방을 하나의 값으로 채워버린다
		Arrays.fill(zoo, null);
		System.out.println(Arrays.toString(zoo));
		
		// Collections.addAll(Collection, value...)
		// : 해당 컬렉션에 값을 여러개 추가할 수 있다
		Set<Integer> numSet = new HashSet<>();
		
		Collections.addAll(numSet, 1, 1, 1, 2, 3, 3, 4, 5, 6);
		System.out.println(numSet);
		
		// Collections.sort(List) : 리스트만 정렬해준다. Set은 정렬이 불가능하다.
		List<String> zooList = new ArrayList<>() {
			// 내부 익명 클래스의 인스턴스 블록
			{
				super.add("판다");
				add("판다");
				add("곰");
				add("사자");
				add("원숭이");
				add("판다");
				add("낙타");
			}
			// 내부 익명 클래스의 인스턴스 블록
		};
		Collections.sort(zooList);
		System.out.println(zooList);
		
		// Collections.shuffle(list) : 전달한 리스트의 순서를 섞는다
		Collections.shuffle(zooList);
		System.out.println(zooList);
		
		// Set의 경우 contains를 쓰는 것이 합리적 ( 값이 1 아니면 0 이기 때문에 )
		// Collections.frequency(Collection, value) : 
		// 전달한 컬렉션에 해당 값이 몇 번 나오는지 알려준다
		int count = Collections.frequency(numSet, 6);
		System.out.println("numSet에서 7이 몇번 나오나요? " + count);
		
		count = Collections.frequency(zooList, "판다");
		System.out.println("판다 몇번 나오나요? " + count);
		
		// Set은 index가 없으므로 값 수정이 불가하기 때문에, 리스트만 사용 가능
		// Collections.fill(list, value) : 모든 값을 전달한 값으로 초기화 한다
		// Set은 값 수정이 불가능하므로 fill도 불가능하다.
		Collections.fill(zooList, null);
		System.out.println(zooList);
		
	}
}
