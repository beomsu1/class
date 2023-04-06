package chapter09;

import java.util.Scanner;

public class Exam3 {
	
	public static void main(String[] args) {
		

	// 사용자에게 이름을 입력 받아 
	// 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고, 
	// 공백으로 입력되었는지도 판별하는 
	//	프로그램을 만들어봅시다.
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		
		if(name.trim().isEmpty()) {
			System.out.println("공백은 허용하지 않습니다.");
		} else{
			if(checkName(name)) {
				System.out.println(checkName(name));
			}else {
				System.out.println("이름을 제대로 입력해주세요.");
			}
		}
		
		
			
		
}
	
	
	//입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고, 
	static boolean checkName(String name) {
		
		boolean result = true;
		
		for(int i=0; i<name.length();i++) {
			char c = name.charAt(i);
			if(!(c>='a' && c<='z' || c>='A' && c<= 'Z')) {
				result = false;
				break;
			}
			
		}
		
		
		return result;
		
	}
	
	
	
}

