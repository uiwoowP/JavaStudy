package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import myobj.KoreanHolidays;

public class D13_GraduateDay_Answer {
	
	public static void classSchedule(int year, int month, int date, int period) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, date - 1); // 오늘부터 체크하기 위해 1뺌
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd(E)");
		int studyDay = 0;
		while (studyDay < period) {
			cal.add(Calendar.DATE, 1); // 하루 증가
			
			String dateStr = dateFormat.format(cal.getTime());
			
			// 증가한 날이 토/일이면 공부한 날이 증가하지 않음
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY) {
				System.out.printf("%s는 쉬는날입니다 (%s).\n", 
						dateStr,
						cal.getDisplayName(
								Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.KOREAN));
				continue;
			}
			
			if (KoreanHolidays.isHoliday(cal)) {
				System.out.printf("%s는 쉬는날입니다.(공휴일)\n", dateStr);
				continue;
			}
			
			System.out.printf("%s는 %d일째 공부하는 날입니다.\n",
					dateFormat.format(cal.getTime()), studyDay + 1);
			++studyDay;
		}
	}
	
	public static void main(String[] args) {
		int year = 2024;
		int month = 1;
		int date = 1;
		int period = 300;
		
		classSchedule(year, month, date, period);
		
	}
	
}
