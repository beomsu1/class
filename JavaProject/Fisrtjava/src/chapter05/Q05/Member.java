package chapter05.Q05;

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
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}

	public Member(String name, String phoneNumber, String major, String grade, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}

	void printInfo() {

		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
		System.out.println("생일 : " + birthday);
		System.out.println("주소 : " + address);
		
	}

}