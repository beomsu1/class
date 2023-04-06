package chapter05.review;

public class Member {

	// ① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	// ② 위에서 정의한 정보를 출력하는 메소드 정의
	// ③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
	// ④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력

	String name;
	String phoneNumber;
	String major;
	String grade;
	String email;
	String birthday;
	String address;

	public Member(String name, String phoneNumber, String major, String grade, String email, String birthday,
			String address) { // 변수 초기화
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

	public void prinfInfo() {
		System.out.println("이름 : " + name + ", 전화번호 : " + phoneNumber + ", 전공 : " + major + ", 이메일 : " + email + ", 생일 : "
				+ birthday + ", 주소 : " + address);
	}

	public static void main(String[] args) {

		Member m1 = new Member("김민재", "010-1111-2222", "축구", "1년차", "KIM@NA", "11월16일", "이탈리아");
		Member m2 = new Member("이강인", "010-2222-3333", "축구", "2년차", "LEE@MA");

		m1.prinfInfo();
		m2.prinfInfo();
	}
}