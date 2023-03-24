package chapter4;

public class Exam6 {

	public static void main(String[] args) {
		
		//while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.
		
		int num = 1;
		int sum =0; //합을 저장하는 변수
				
		while (num<100) {
			// 반복 처리하는 문장 : 합을 구하는 연산
			sum = sum + num; // sum += num;
			
			num++;
		}
		
		
		sum=0;
		for(int i=1;i<100;i++) { //안에서 지역변수 선언시 괄호안에서만 호출가능 
			sum = sum + i;
			System.out.println("1~99까지의 합은 : " + sum);
		}
		
		
		System.out.println("1~99까지의 합은 : " + sum );
	}

}
