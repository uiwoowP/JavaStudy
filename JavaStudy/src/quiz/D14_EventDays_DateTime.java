package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

public class D14_EventDays_DateTime {
	/*
	 
	 	java.time 패키지의 클래스들만 활용하여
	 	실행하면 오늘부터 앞으로 1년간의 이벤트 날짜를 모두 출력해주는
	 	프로그램을 만들어주세요
	 	
	 	1+1 이벤트 : 매 월 18일
	 	20% 할인 인벤트 : 홀수번째 주 금요일
	 	구매시 아메리카노 무료 이벤트 : 매주 화요일
	 	
	 	※ 이벤트 날짜가 겹치는 날에는 모든 이벤트를 출력해줘야 한다
	 
	 */
	
	public static ArrayList<LocalDate> firstThird() {
		LocalDate now = LocalDate.now();
		ArrayList<LocalDate> arr = new ArrayList<>();
		
		 for (int month = now.getMonthValue(); month < now.getMonthValue() + 12; ++month) {
            LocalDate firstDay = LocalDate.of(now.getYear(), now.getMonth(), 1);
            LocalDate firstWeek = firstDay.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
            LocalDate thirdWeek = firstWeek.plusDays(14);
            arr.add(firstWeek);
            arr.add(thirdWeek);
		 }
		 
		 return arr;
}
	
	public static void printEvent() {
		LocalDate now = LocalDate.now();
		StringBuilder sb = new StringBuilder();
		String event = "";
		
		for (int i = 0; i < 365; ++i) {
			
			if (now.getDayOfMonth() == 18) {
				event += " [1+1 이벤트!!] ";
			}
			
			if (now.equals(now.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)))
						|| now.equals(now.plusDays(14).with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)))) {
					event += " [20% 할인 이벤트!!] ";
			}
			
			if (now.getDayOfWeek() == DayOfWeek.TUESDAY) {
				event += " [무료 아메리카노!!] ";
			}
			
			sb.append(now + event + '\n');
			event = "";
			now = now.plusDays(1);

		}
		
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		firstThird();
		printEvent();
	}

}
