package chapter05.Q05;

public class MemberMain {

	public static void main(String[] args) {

		Member member1 = new Member("김민재", "010-0000-0000", "나폴리", "1년차", "KIM@naf", "11월 15일", "이탈리아");
		Member member2 = new Member("이강인", "010-0000-0000", "마요르카", "2년차", "KANG@MA");

		member1.printInfo();
		System.out.println();
		member2.printInfo();
		
	}
	
}
