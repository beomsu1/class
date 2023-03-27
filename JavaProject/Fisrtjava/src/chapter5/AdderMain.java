package chapter5;

public class AdderMain {

	public static void main(String[] args) {
		
		Adder adder = new Adder(); // 인스턴스 생성
		
		adder.add(10);
		System.out.println(adder.add(10, 20));
		System.out.println(adder.add(10.0f, 20.0f));
	
	}

}
