package chapter5.Q05;

public class MemberPrivate {

	private String name;
	private String phoneNumber;
	private String major;
	private String grade;
	private String email;
	private String birthday;
	private String address;

	public MemberPrivate(String name, String phoneNumber, String major, String grade, String email, String birthday,
			String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}

	public MemberPrivate(String name, String phoneNumber, String major, String grade, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}

	public void printInfo() {

		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
		
//		if(birthday != null) {
//			System.out.println("생일 : " + birthday); // null
//		} else {
//			System.out.println("생일 : 미입력");
//		}
		
		System.out.println("생일 : " + (birthday != null ? birthday : "미입력"));
		
//		if(address != null) {
//		System.out.println("주소 : " + address);
//		} else {
//			System.out.println("주소 : 미입력 " );
//		}
		
		System.out.println("주소 :" + (address != null ? address : "미입력"));
	}

}