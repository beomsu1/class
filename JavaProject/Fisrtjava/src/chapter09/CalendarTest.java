package chapter09;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		cal.add(Calendar.HOUR,1);	// 1시간 추가
		System.out.println(cal.getTime());
		
		cal.add(Calendar.DAY_OF_MONTH, 1); // 1일 추가
		System.out.println(cal.getTime());
		
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
	
		cal2.set(2023, 3, 1);
		cal3.set(2023, 5, 1);
		
		System.out.println(cal2.getTime());
		System.out.println(cal3.getTime());
		
		System.out.println(cal.before(cal2));
		System.out.println(cal.before(cal3));
		
		if(cal.before(cal2)) {
			System.out.println("이벤트 진행중입니다.");
		} else {
			System.out.println("종료된 이벤트입니다.");
		}
		
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
	}
	

}