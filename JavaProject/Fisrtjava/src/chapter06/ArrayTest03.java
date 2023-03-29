package chapter06;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		// 배열의 선언
		int[] scores; //int 타입의 배열 인스턴스 주소를 가지는 변수
		
		// 배열의 생성
		scores = new int[15]; // int 타입의 요소 생성
		
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
		scores[10] = 80;
		scores[11] = 99;
		scores[12] = 55;
		scores[13] = 38;
		scores[14] = 22;
		
		ArrayTest03 at = new ArrayTest03();
		
		at.resultPrint(scores);
		
	}

	// 점수를 저장하고 있는 배열을 전달받아 총점과 평균값을 출력하는 메소드
	static void resultPrint(int[] arr) { // int[] arr = scores;
		
		// 전달받은 배열은 : int 타입의 배열이다. size 제약은 없다.
		int sum = 0; 	  // 지역변수라 초기화
		float avg = 0.0f; // 지역변수라 초기화
		
		for(int i =0 ; i<arr.length ; i++) {
			sum += arr[i];
			avg = sum/(float)arr.length; // 강제형변환
			
//			System.out.println("-------------------");
//			
//			System.out.println("총점 : " + sum);
//			System.out.println("평균 : " + avg);
		
			
		}
		System.out.println("-------------------");
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

	}
	
	
	
}
