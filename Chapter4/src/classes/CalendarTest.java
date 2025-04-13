package classes;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		System.out.println(cal.getTime()); // 현재 날짜와 시간이 나옴
		System.out.println();
		
		// 현재 시간 - 1970년 1.1 자정 이후부터 지금까지의 시간을 밀리초(ms)로 측정
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTimeInMillis() / 24*60*60*1000); // 일
		System.out.println(cal.getTimeInMillis() / (24*60*60*1000) / 365); // 연도
		System.out.println();
		
		// 날짜 - 년 월 일
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month + 1);
		
		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		System.out.println();
		
		// 시간 - 시 분 초
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println(second);
		System.out.println();
		
		// 요일 - {1:일 2:월 3:화 4:수 5:목 6:금 7:토}
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		String[] days = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(days[day-1]);
	}

}
