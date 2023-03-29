package chapter05;

public class ClassMethod {

	int iv = 10; // 인스턴스 변수
	
	static int cv =30; // 클래스 변수
	
	// 인스턴스 메소드
	void printNumber1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void printNumber2() {
		System.out.println("ClassMethod");
		ClassMethod cm = new ClassMethod();
		System.out.println(cm.iv); // 인스턴스 생성하고 사용해야 호출가능.
		cm.printNumber1();
//		System.out.println(iv); // 클래스 생성시점하고 인스턴스 생성시점이 달라서 사용불가
	}
	
	public static void main(String[] args) {
		ClassMethod.printNumber2();
	}
	
}
