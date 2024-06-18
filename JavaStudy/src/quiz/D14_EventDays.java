package quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class D14_EventDays {
	/*
	 
	 	실행하면 오늘부터 앞으로 1년간의 이벤트 날짜를 모두 출력해주는 
	 	프로그램을 만들어주세요
	 	
	 	1+1 이벤트 : 매월 18일
	 	20% 할인 이벤트 : 홀 수번째 주 금요일
	 	구매시 아메리카노 무료 이벤트 : 매주 화요일
	 	
	 	※ 이벤트 날짜가 겹치는 날에는 모든 이벤트를 출력해줘야 한다
	 
	 */
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd (E)");
		String simpleToday = sdf.format(today.getTime());
		StringBuilder sb = new StringBuilder();
		System.out.println(simpleToday);
		
		Calendar lastDay = Calendar.getInstance();
		lastDay.add(Calendar.DAY_OF_YEAR, 365);
		String simpleLastDay = sdf.format(lastDay.getTime());
		System.out.println(simpleLastDay);
		
		ArrayList<String> plusOne = new ArrayList<>();
		ArrayList<String> twentyDisc = new ArrayList<>();
		ArrayList<String> freeAmericano = new ArrayList<>();
		ArrayList<String> allEvents = new ArrayList<>();
		
		

		int idx = 0;
		while (idx < 365) {
			String event = "";
			today.add(Calendar.DAY_OF_YEAR, 1);
			simpleToday = sdf.format(today.getTime());
			System.out.println(simpleToday);
			
			
			if (today.get(Calendar.DAY_OF_WEEK) == 3) {
				freeAmericano.add(simpleToday);
				System.out.println(simpleToday + " 1+1 이벤트!! ");
				event += " 1+1 이벤트!! ";
			}
			
			if (today.get(Calendar.DAY_OF_MONTH) == 18) {
				plusOne.add(simpleToday);
				System.out.println(simpleToday + " 20% 할인 이벤트!! ");
				event += " 20% 할인 이벤트!! ";
			}
			
			if (today.get(Calendar.WEEK_OF_MONTH) % 2 != 0) {
				int week = today.get(Calendar.DAY_OF_WEEK);
				if (week == 6) {
					twentyDisc.add(simpleToday);
					System.out.println(simpleToday + " 무료 아메리카노!! ");
					event += " 무료 아메리카노!! ";
				}
			}
			
			sb.append(simpleToday + event + '\n');
			event = "";
			idx++;
		}

		System.out.println("1+1 이벤트 :" + plusOne);
		System.out.println("20% 할인 이벤트 : " + twentyDisc);
		System.out.println("구매시 아메리카노 : " + freeAmericano);
		
		System.out.println(sb);
		
		allEvents.addAll(plusOne);
		allEvents.addAll(freeAmericano);
		allEvents.addAll(twentyDisc);
		
		HashMap<String, String> eventsByDate = new HashMap<>();
		
		for (String date : plusOne) {
			eventsByDate.put(date, "1+1 이벤트 !! ");
		}
		
		for (String date: twentyDisc) {
			eventsByDate.put(date, "20% 할인 이벤트 !! ");
		}
		
		for (String date: freeAmericano) {
			eventsByDate.put(date, "구매시 아메리카노 !! ");
		}
		
		System.out.println(eventsByDate);
		
	}

}
