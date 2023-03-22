package chapter02;

public class PrintTest2 {

	public static void main(String[] args) {

		// 안녕하세요! 저는 OOO입니다. 나이는 00살 입니다.
		
		String name = "손흥민";
				
		System.out.print("안녕하세오! 저는 ");
		System.out.print(name);
		System.out.print("입니다.");
		
		System.out.println(); //개행
		
		System.out.printf("안녕하세요! 저는 %s입니다. 나이는 %d살 입니다. \n", name , 31);
		
		System.out.printf("안녕하세요. 저는 %s입니다. \n", "JAVA");
		System.out.printf("저는 %d살입니다. \n" , 20);
		System.out.printf("정수 : %d , 실수 : %f \n", 10 , 13.5);
		System.out.printf("문자 : %c , 문자열 : %s" , 'Z' , "KING");
		
	}

}
