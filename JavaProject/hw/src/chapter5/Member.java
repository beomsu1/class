package chapter5;

public class Member {

	String name;
	String phoneNumber;
	String major;
	String grade;
	String email;
	String birthday;
	String address;
	
	public Member(String name, String phoneNumber, String major, String grade, String email, String birthday,
			String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}

	public Member(String name, String phoneNumber, String major, String grade, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}

	public void prinfInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
		System.out.println(birthday != null ? birthday : "미입력");
		System.out.println(address != null ? address : "미입력");
	}
	
	public static void main(String[] args) {
		
		Member m = new Member("이강인", "010-1111-2222", "미드필더", "2년차", "KANG@MA", "9월20일", "스페인");
		Member m1 = new Member("김민재", "0000-9999-8888", "센터백", "1년차", "KIM@NA");
		
		m.prinfInfo();
		System.out.println();
		m1.prinfInfo();
	}
	
}
