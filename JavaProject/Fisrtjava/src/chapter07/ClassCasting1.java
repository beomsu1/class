package chapter07;

public class ClassCasting1 {

	public static void main(String[] args) {

		AndroidPhone androidPhone = new AndroidPhone("010-1111-5222");

		Phone phone = new AndroidPhone("11");
		Phone p = new Iphone("222");

		Phone phone1 = (Phone) androidPhone;
		Phone phone2 = androidPhone; // 하위타입의 참조변수를 상위타입으로 변경은 생략가능.

		AndroidPhone phone3 = (AndroidPhone) phone; // 상위타입에서 하위타입으로 갈 때는 형변환 해줘야함

		// AndroidPhone phone4 = (AndroidPhone)p; // p = new Iphone("222"); 같은 하위타입이지만
		// 자료형 타입이 달라서 형변환을 해줘도 불가.

		Iphone iphone = null;
		AndroidPhone androidPhone2 = null;

		if (p instanceof Iphone) {  //아이폰으로 형변환이 가능하면 아이폰.call 실행
			iphone = (Iphone) p;
			iphone.call();

		} else if (p instanceof AndroidPhone) { // 안드로이드로 형변환이 가능하면 안드로이드.call 실행
			androidPhone2 = (AndroidPhone) p;
			androidPhone2.call();
		}

	}

}
