package contact;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact c = new Contact("김민재", "010-1111-2222", "KIM@naf", "이탈리아", "19961116", "나폴리");
		
		System.out.println("이름 : " + c.getName()); //private 이기에 get을 참조해야함
		System.out.println("전화번호 : " + c.getPhoneNumber());
		System.out.println("이메일 : " + c.getEmail());
		System.out.println("주소 : " + c.getAddress());
		System.out.println("생일 : " + c.getBirthday());
		System.out.println("그룹 : " + c.getGroup());
		
		System.out.println("--------------------");
		
		c.printData();
		
		c.setPhoneNumber("010-9999-8888");
		c.setEmail("KIM@REAL");
		c.setAddress("스페인");
		c.setBirthday("1996.10.10");
		
		System.out.println("--------------------");
		c.printData();
	}

}
