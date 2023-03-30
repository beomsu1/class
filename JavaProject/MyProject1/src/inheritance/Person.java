package inheritance;

public class Person {
	
	String name;
	String ssn;
	
	public Person() {}
	
	public Person(String name, String ssn) { // 변수 초기화 하는 생성자
		this.name = name;
		this.ssn = ssn;
	}

	public void hello() {
		System.out.print("안녕하세요. 저는"+name+"입니다. 주민등록번호는 "+ssn+" 입니다.");
	}
	
	
	
}
