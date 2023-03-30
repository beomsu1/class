package chapter07;

public class ClassArray {

	public static void main(String[] args) {

		// 상위 타입의 배열 인스턴스 생성
		Phone[] phones = new Phone[5];

		phones[0] = new AndroidPhone("011-111-1111");
		phones[1] = new Iphone("012-222-2222");
		phones[2] = new Iphone("012-333-3333");
		phones[3] = new AndroidPhone("011-3333-3333");
		phones[4] = new AndroidPhone("010-7777-7777");

		for (Phone phone : phones) {
			phone.call();

		}

	}

}
