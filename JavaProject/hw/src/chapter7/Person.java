package chapter7;

public class Person {

	private String name;
	private String sNum;
	
	public Person(String name, String sNum) {
		super();
		this.name = name;
		this.sNum = sNum;
	}

	public void hello() {
		System.out.println("안녕하세요. 저는 "+name+"입니다."+age()+"살 입니다.");
		}
	
	
	private int age() {
		int age = 0;
		
		String year = sNum.substring(0, 2);
		char gender = sNum.charAt(7);
		
		if(gender<'3') {
			age = 2023 - 1900 - Integer.parseInt(year) +1;
		} else {
			age = 2023 - 2000 - Integer.parseInt(year) +1;
		}
		return age;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person("이범수", "981221-1012222");
		p.hello();
	}
	
}
