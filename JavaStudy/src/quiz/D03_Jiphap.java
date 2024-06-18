package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class D03_Jiphap {
	/*
	 
	 	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
	 	   [1, 2, 3] + [2, 3, 4, 5] => [1, 2, 3, 4, 5]
	 	  
	 	2. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
	 	   [1, 2, 3] 교 [2, 3, 4, 5] => [2, 3]
	 	   
	 	3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
	 	   [1, 2, 3] - [2, 3, 4, 5] => [1]
	 	   [2, 3, 4, 5] - [1, 2, 3] => [4, 5]
	 */
	
	//1
	 static HashSet hap (ArrayList a, ArrayList b) {
		HashSet<Integer> rst = new HashSet<>();
		rst.addAll(a);
		rst.addAll(b);
		return rst;
	}
	
	//2 
	 static HashSet gyo (ArrayList a, ArrayList b) {
		HashSet<Integer> rst = new HashSet<>();
		a.retainAll(b);
		rst.addAll(a);
		return rst;
	}
	
	//3
	 static HashSet cha (ArrayList a, ArrayList b) {
		HashSet<Integer> rst = new HashSet<>();
		a.removeAll(b);
		rst.addAll(a);
		return rst;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		ArrayList<String> sArr1 = new ArrayList<>();
		ArrayList<String> sArr2 = new ArrayList<>();
		
		sArr1.add("고양이");
		sArr1.add("호랑이");
		sArr1.add("오징어");
		sArr1.add("오징어");
		
		sArr2.add("개나리");
		sArr2.add("진달래");
		sArr2.add("고양이");
		sArr2.add("무궁화");
		sArr2.add("동백");
		sArr2.add("호랑이");
		
		System.out.println(hap(sArr1, sArr2));
		System.out.println(gyo(sArr1, sArr2));
		
		sArr1.removeAll(sArr1);
		sArr2.removeAll(sArr2);
		
		sArr1.add("고양이");
		sArr1.add("호랑이");
		sArr1.add("오징어");
		sArr1.add("오징어");
		
		sArr2.add("개나리");
		sArr2.add("진달래");
		sArr2.add("고양이");
		sArr2.add("무궁화");
		sArr2.add("동백");
		sArr2.add("호랑이");
		
		System.out.println(cha(sArr1, sArr2));
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		
		System.out.println(hap(arr1, arr2));
		System.out.println(gyo(arr1, arr2));
		
		arr1.removeAll(arr1);
		arr2.removeAll(arr2);
		
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		
		System.out.println(cha(arr1, arr2));
		
	}

}
