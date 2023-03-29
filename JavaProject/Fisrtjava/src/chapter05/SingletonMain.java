package chapter05;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		// s = new Singleton(); // private 때문에 숨겨져있다고 나옴
							 // 외부에서 인스턴스 생성이 불가
		s.printData();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s1.printData();
		
	}

}
