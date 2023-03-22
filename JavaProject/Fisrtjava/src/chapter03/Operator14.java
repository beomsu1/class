package chapter03;

public class Operator14 {

	public static void main(String[] args) {
		
		short snum1 = 20;
		short snum2 = 30;
		
		snum1 += snum2; // snum1 = snum1 + snum2
		
//		snum1 = snum1 + snum2; // 자료형이 맞지 않아서 오류발생
		
		System.out.println(snum1);
		
		
		int num = 10;
		
		num += 5; // num = num + 5 == 10 + 5
		System.out.println(num); // 15
		
		num -= 5; // num = num -5 == 15 - 5
		System.out.println(num); //10
		
		num *= 2; // num =  num *2 == 10 * 2
		System.out.println(num);
		
		num /= 2; // num = num /2 == 20 / 2
		System.out.println(num);
		
		num %= 3; // num = num %3 == 10 % 3
		System.out.println(num);
	}

}
