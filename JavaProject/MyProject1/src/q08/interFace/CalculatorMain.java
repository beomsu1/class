package q08.interFace;

//3. 다형성의 특징으로 상위 타입인 인터페이스 타입의 참조변수에 인터페이스를 구현한 클래스 타입의 인스턴스를 참조하는 코드를 작성해 봅시다.

public class CalculatorMain extends CalculatorClass {
	
	public static void main(String[] args) {
		
		CalculatorMain c = new CalculatorMain();
		
		System.out.println("두 수의 합은 : " + c.add(10, 2));
		System.out.println("두 수의 차는 : " + c.substract(5, 7));
		System.out.println("두 수의 곱은 : " + c.multiply(7, 7));
		System.out.println("두 수의 몫은 : " + c.divide(4, 2));
	}
}
