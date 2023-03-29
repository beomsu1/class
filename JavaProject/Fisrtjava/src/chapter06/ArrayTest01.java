package chapter06;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		// 배열의 선언
		int[] scores; //int 타입의 배열 인스턴스 주소를 가지는 변수
		
		// 배열의 생성
		scores = new int[10]; // int 타입의 요소 생성
		
		for(int i = 0 ; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// 배열 요소의 참조
		// 배열이름[index]
		// index -> 0 ~ n-1
		// 요소의 개수 -> 배열변수.lenght 
		
		scores[0] = 60;
		scores[1] = 49;
		scores[2] = 88;
		scores[3] = 94;
		scores[4] = 74;
		scores[5] = 69;
		scores[6] = 17;
		scores[7] = 76;
		scores[8] = 34;
		scores[9] = 68;
		//scores[10] = 60;
		
		//총합
		int sum= 0;
		//평균값
		float avg = 0.0f;
		
		
//		System.out.println(scores[0]);
		// index -> 0~9
		for(int i=0; i<scores.length; i++) { // i<scores.length == i<10
			System.out.println(scores[i]);
			
		//합의 연산
			sum = sum + scores[i];
			
		}
		
		avg = sum/(float)scores.length; // (float)를 붙여서 강제형변환
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
