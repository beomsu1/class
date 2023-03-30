package chapter07;

public class Child extends Parent {

	int num = 100;

	void showData(int num) {
		System.out.println("상위 클래스의 num :" + super.num); // super 상위 클래스를 언급할때 사용
		System.out.println("하위 클래스의 num :" + this.num);
		System.out.println("지역 변수의 num :" +  num);
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.showData(1000);
	}
}
