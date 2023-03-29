package chapter05;

public class InstanceVariable {

	String name = "KING"; //인스턴스 변수. 앞에다가 Static을 붙이면 클래스 변수.
	int age = 15;
	
	void tellName() {
		System.out.println("나의 이름은 " + name +"입니다.");
		System.out.println("나의 이름은 " + ClassVariable.name + "입니다"); // 클래스 변수로 등록된 것 이기에 호출가능
	}
	
	void tellAge() {
		System.out.println("나이는 " +age + "살 입니다.");
	}

	public static void main(String[] args) {
		
		// 인스턴스 변수는 인스턴스를 생성했을 때 생성 -> 인스턴스가 종료될 때 소멸
		
		InstanceVariable iv = new InstanceVariable();
		
		System.out.println(iv.name);
		System.out.println(iv.age);
		
		//...
		
		iv.tellName();
		iv.tellAge();
	
	}
	
}
