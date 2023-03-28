package chapter5.phone;

import java.util.Date;

public class MemberMain {

	public static void main(String[] args) {
		
		Date now= new Date();
		java.sql.Date time = new java.sql.Date(0);
		
		SmartPhone smartphone = new SmartPhone();
		
		Member member1 = new Member("김민재", "kim@gmail" , 20 , "010-0000-0000" , smartphone);
		Member member2 = new Member("박지성","park@gmail");
		
		member1.showData();
		System.out.println();
		member2.showData();
		
		dataPrint(member1); // 매개변수의 인자 => Member 타입의 인스턴스를 가르키는 주소값
		dataPrint(member2);
	}
	
	static void dataPrint (Member member) {
		// Member member = member1
		// Member member : 매개변수 , 참조변수
		
		member.showData();
	}

}
