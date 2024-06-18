package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class D13_GraduateDay {
	
	/*
	 	사용자가 수업이 시작한 날짜와 수업을 받아야하는 날을 입력하면
	 	수업을 쉬는 날을 모두 출력해주고
	 	수업이 종료되는 날짜도 알려주는 프로그램을 만들어보세요
	 	
	 	쉬는날 - 토, 일 한국의 공휴일(대체 휴일 포함)
	 */
	
	public static void main(String[] args) {
		int saturdays = 0;
		int sundays = 0;
		int holiday = 0;
		String[] HOLIDAYS = {
				"2024-01-01", "2024-02-09", "2024-02-10", "2024-02-11",
				"2024-02-12", "2024-03-01", "2024-04-10", "2024-05-06",
				"2024-05-15", "2024-06-06", "2024-07-17", "2024-08-15",
				"2024-09-16", "2024-09-17", "2024-09-18", "2024-10-03",
				"2024-10-09", "2024-12-25"
		};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력해 주세요: ");
		int startYear = sc.nextInt();
		int startMonth = sc.nextInt();
		int startDay = sc.nextInt();
		System.out.println("수업 일수를 입력하세요: ");
		int schoolDays = sc.nextInt();
		
		Calendar startDate = Calendar.getInstance();
		
		startDate.set(Calendar.YEAR, startYear);
		startDate.set(Calendar.MONTH, startMonth - 1);
		startDate.set(Calendar.DATE, startDay);
		
		System.out.println("수업을 시작하는 날짜");
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd E");
		String start = sdf.format(startDate.getTime());
		System.out.println(start);
		
		Calendar endDate = Calendar.getInstance();
		
		endDate.set(Calendar.YEAR, startYear);
		endDate.set(Calendar.MONTH, startMonth - 1);
		endDate.set(Calendar.DATE, startDay);
		endDate.set(Calendar.DAY_OF_YEAR, schoolDays);
		
		int idxStart = startDate.get(Calendar.DAY_OF_YEAR);
		int idxEnd = endDate.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("------------------------");
		
		SimpleDateFormat sdf2 = 
				new SimpleDateFormat("yyyy-MM-dd");
		
		for (int i = idxStart; i < idxEnd; ++i) {
			String holidayCheck = sdf2.format(startDate.getTime());	
			
			if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				saturdays++;
			} else if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				sundays++;
			}
			for (int j = 0; j < HOLIDAYS.length; ++j) {
				if (holidayCheck.equals(HOLIDAYS[j])) {
					holiday++;
				}
			}
			
			startDate.set(Calendar.DAY_OF_YEAR, i);
			
		}
		
		System.out.println("총 토요일의 수 : " + saturdays);
		System.out.println("총 일요일의 수 : " + sundays);
		System.out.println("총 공휴일의 수 : " + holiday);
		System.out.println("------------------------");

		endDate.set(Calendar.DAY_OF_YEAR, schoolDays + (saturdays + sundays + holiday));
		
		System.out.println("수업이 끝나는 날짜");
		String end = sdf.format(endDate.getTime());
		System.out.println(end);
		
		
	}
}
