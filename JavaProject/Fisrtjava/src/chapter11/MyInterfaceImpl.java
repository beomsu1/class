package chapter11;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		return t;
	}

	
	
	public static void main(String[] args) {
		
		MyInterfaceImpl<String, Integer> my = null; // 메소드 안에서 지역변수를 초기화
	//	my = new MyInterfaceImpl<String, Integer>(); 타입 생략가능
		my = new MyInterfaceImpl();
		
		System.out.println(my.method1("Ten"));
		System.out.println(my.method2(10));
	}
}
