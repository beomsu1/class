package chapter04;

public class Exam5 {

	public static void main(String[] args) {
		
		// num < 0 이라면 “0 미만” 출력 부분은 if문을 사용하고 
		
		int num = 500;
		
		if (num<0) {
			System.out.println("0 미만");
		} else {
			
			switch(num/100) {
			case 0: // 0~99
				System.out.println("0 이상 100미만");
				break;
			case 1:
				System.out.println("100이상 200미만");
				break;
			case 2:
				System.out.println("200이상 300미만");
				break;
			default :
				System.out.println("300이상");
				break;
			
			}
		}
		
		
		
	}

}
