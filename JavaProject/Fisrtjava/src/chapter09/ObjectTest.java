package chapter09;

public class ObjectTest {

	public static void main(String[] args) {
		Car c1 = new Car("2023A001");
		Car c2 = new Car("2077B071");
		Car c3 = c1;
		Car c4 = new Car("2023A001");

		System.out.println(c1.toString());
		System.out.println(c2.toString());

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		System.out.println(c1.equals(null));
		System.out.println(c1.equals("2023A001")); // 차량을 비교로 했을때 전제이기에 문자열 비교는 false로 나옴 
	}

}

class Car {

	String carNo;

	Car(String carNo) {
		this.carNo = carNo;
	}

	@Override
	public boolean equals(Object obj) {
		
		// obj -> null값이 들어오면 =< false
		// obj -> car 타입으로 형변환 가능해야함.
		Car car = null;
		if(obj != null && obj instanceof Car) {
			// obj -> 형변환 하고 carNo를 비교해서 결과값을 반환
			car = (Car)obj;
			// 문자열을 비교해서 같은지 여부 반환
			if(carNo.equals(car.carNo)) {
				return true;
			}
		}
		
		
		return false;
	}

	@Override
	public String toString() {
		return carNo + "차량입니다.";
	}

}