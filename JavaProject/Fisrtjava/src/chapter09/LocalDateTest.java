package chapter09;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTest {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.getYear());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getMonthValue());
		
		LocalDate nextDay1 = now.plusDays(1);	// now에 1일 더하는 메소드
		System.out.println(nextDay1);
		LocalDate nextDay2 = now.plusMonths(1);	// now에 1달 더하는 메소두
		System.out.println(nextDay2);
		LocalDate nextDay3 = now.plusYears(1);	// now에 1년 더하는 메소드
		System.out.println(nextDay3);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		System.out.println(now2.getHour());	//시간을 보여주는 메소드
		System.out.println(now2.getMinute());	// 분을 보여주는 메소드
		System.out.println(now2.getSecond());	// 초를 보여주는 메소드
		
		LocalDate day2 = LocalDate.of(2023, 12, 21); // 날짜를 만드는 메소드
		System.out.println(day2);
		
		LocalDateTime day3 = LocalDateTime.of(2023, 6, 3, 17, 50, 30); // 날짜를 만드는 메소드
		System.out.println(day3);
		
		LocalDate day4 = LocalDate.parse("2024-12-21");	// 문자열을 입력해서 날짜 만드는 메소드
		System.out.println(day4);
		
		
	}

}
