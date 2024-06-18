package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class E02_CorrectNumber {
	static Scanner sc = new Scanner(System.in);
	/*
	 
	 	예외처리 방식을 사용하여 다음을 구현하세요
	 	
	 	1. 사용자가 중복없는 4개의 숫자를 한 글자씩 입력해야 한다
	 	
	 	2. 사용자가 입력한 숫자가 0 ~ 9 사이의 숫자가 아닌경우 예외가 발생해야 한다
	 	
	 	3. 사용자가 입력한 숫자가 이미 입력했던 숫자인 경우 예외가 발생해야 한다
	 	
	 	4. 숫자 4개를 모두 입력하고 나면 입력했던 숫자를 다시한번 하나씩 입력하여 확인해야 한다
	 	
	 	5. 사용자가 입력했던 숫자와 이번에 입력한 숫자가 다르다면 예외가 발생해야 한다
	 
	 */
	
	// 1, 2, 3
	static ArrayList<Integer> method1() 
			throws SameNumberException, MoreThanTenException {
		ArrayList<Integer> arr = new ArrayList<>();
		
		while (arr.size() != 4) {
			try {
				int num = sc.nextInt();
				
				if (num >= 10) {
					throw new MoreThanTenException();
				}
				
				if (arr.contains(num)) {
					throw new SameNumberException();
				} else {
					arr.add(num);
				}
			} catch (SameNumberException | MoreThanTenException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			
		}
		return arr;
	}
	
	static void check(ArrayList<Integer> arr) 
			throws InputSameNumberException {
		for (int i = 0; i < 4; ++i) {
			int input = sc.nextInt();
			if (arr.get(i) != input) {
				throw new InputSameNumberException();
			}
		}
	}
	
	public static void main(String[] args) 
	throws SameNumberException, MoreThanTenException {
		System.out.println(method1());
	}

}

class SameNumberException extends Exception {
	public SameNumberException() {
		super("같은 숫자를 입력했습니다. 모두 다른 숫자를 입력해주세요.");
	}
}

class MoreThanTenException extends Exception {
	public MoreThanTenException() {
		super("입력한 숫자가 10보다 더 큽니다.");
	}
}

class InputSameNumberException extends Exception {
	public InputSameNumberException() {
		super("이미 입력했던 숫자입니다.");
	}
}

class DiffentCheckNumberException extends Exception {
	public DiffentCheckNumberException() {
		super("이전에 입력했던 숫자와 다릅니다.");
	}
}
