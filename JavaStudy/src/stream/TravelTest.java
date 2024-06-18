package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		TravelCustomer customer1 = new TravelCustomer("스폰지밥", 40, 100);
		TravelCustomer customer2 = new TravelCustomer("뚱이", 20, 100);
		TravelCustomer customer3 = new TravelCustomer("징징이", 13, 50);
		TravelCustomer customer4 = new TravelCustomer("게리", 50, 70);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream()
		.map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 : " + total + "입니다");
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream()
		.filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
		.forEach(s -> System.out.println(s));
		
	}

}
