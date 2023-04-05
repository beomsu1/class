package chapter09;

public class Person {
	
	String name;
	String personNumber;
	
	
	public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}


	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		// 주민등록번호가 같으면 같은 인스턴스로 판별
		// 매개변수로 전달받은 obj를 person 타입으로 형변환 (null이 아닌 상태에서 instanceof로 형변환 여부 체크)
		// -> personNumber를 비교하고 결과값을 result에 대입
		if(obj!=null && obj instanceof Person) {
			Person p = (Person)obj;
			result = this.personNumber.equals(p.personNumber);
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person("이강인", "971211-1000000");
		Person p2 = new Person("손흥민", "920411-1100000");
		System.out.println(p1.equals(p2));
	}
	
	
}
