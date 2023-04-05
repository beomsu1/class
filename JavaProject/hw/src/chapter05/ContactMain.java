package chapter05;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact c = new Contact("김민재", "010-4567-7897", "KIM@NA", "이탈리아", "11월16일", "나폴리");
		
		System.out.println("이름 : " + c.getName()); // name은 안되고 private이라서 get을 참조
		System.out.println("전화번호 : " + c.getPhoneNumber());
		System.out.println("이메일 : " + c.getEmail());
		System.out.println("주소 : " + c.getAddress());
		System.out.println("생일 : " + c.getBirthday());
		System.out.println("그룹 : " + c.getGroup());
		
		System.out.println("-----------------------");
		
		c.printInfo();
		
		c.setPhoneNumber("010-1111-2222"); // set으로 참조해면 정보 변경가능
		c.setBirthday("21321");
		
		System.out.println("---------------");
		
		c.printInfo();
	}
}
