package chapter09;

public class RandomTest {

	public static void main(String[] args) {
		
		// 특정 범위의 난수 추출
//		int num = (int)(Math.random()*10)+1; 
//		// 0 ~ 0.9999999999 -> 0 ~ 9.999999999 -> int 변환하면 소수점 없어짐 : 0 ~ 9 -> +1을 해주면 1~10 사이의 난수 출력 가능
//		System.out.println(num);
		
		for(int i =0; i<6 ; i++) {
			int num = (int)(Math.random()*45)+1;
			// 0 ~ 0.9999999999 -> 0 ~ 9.999999999 -> int 변환하면 소수점 없어짐 : 0 ~ 44 -> +1을 해주면 1~45 사이의 난수 출력 가능
			System.out.println(num);
		}
		
	}

}
