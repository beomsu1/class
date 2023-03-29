package chapter05;

public class ClassVariableMain {

	public static void main(String[] args) {
		
		System.out.println(ClassVariable.name);
		System.out.println(ClassVariable.age);
		
		ClassVariable cv = new ClassVariable(); // 인스턴스를 생성
		
		cv.tellAge(); // 인스턴스를 생성해야 사용 할 수 있음.
		cv.tellName();// 인스턴스를 생성해야 사용 할 수 있음.
	}
	
	
}
