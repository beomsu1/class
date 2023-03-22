package chapter02;

public class ByteOverflow {
//		// 다루어야 하는 데이터의 범위에 따라서 타입설정이 달라져야한다.
//		// 0~270
//		// 0에서 1씩 더해서 270까지 증가
//		
//		// for(초기식 ; 비교식 ; 증감식) { 반복해야하는 코드들}
	
	
	public static void main(String[] args) {
		
		byte b =0;
		int i = 0;
		
		for(int x = 0; x <=270 ; x++) {
			System.out.println(b + "\t" + i);
		b++;
		i++;
		}
	}
}