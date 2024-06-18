package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntArrayTest {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sumVal = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s));
		
		Stream<String> stream2 = sList.stream();
		stream2.sorted().forEach(s -> System.out.print(s));
		
		Arrays.stream(arr).reduce(0, (a, b) -> a + b);
		
	}
}
