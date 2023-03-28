package chapter5;

public class ModifierPrivate {

	private String name; // private 같은 클래스에서만 참조가능
	private int age;

	public ModifierPrivate(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 은닉된 변수들은 정해진 메소드를 통해서 엑세스, 설정하게 한다.
	// Getter
	public String getName() { // 타입 맞추고 get + name 이면 gerName 첫번쨰는 대문자로
		return this.name;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}
	// Getter
	public int gerAge() {
		return this.age;
	}
	// Setter
	public void setAge(int age) {
		this.age = age;
	}

	void tell() {
		System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
	}
}
