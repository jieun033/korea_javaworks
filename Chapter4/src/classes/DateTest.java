package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// 오늘 날짜 객체 생성
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd"); // 날짜 포맷. MM은 12시간제. mm은 24시간제.
		System.out.println(date.format(today));
		
		SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss"); // 시간 포맷. a는 오전/오후 표기.
		System.out.println(time.format(today));

	}

}
