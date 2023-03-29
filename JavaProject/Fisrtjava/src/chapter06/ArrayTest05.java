package chapter06;

public class ArrayTest05 {

	public static void main(String[] args) {
		
		// 2차원 배열 선언과 초기화
		int[][] arr = {
				{1,3,5},{2,4,6},{7,8,9},{10,11,12}
		};
		
		System.out.println(arr.length);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		System.out.println(arr[3][0]);
		System.out.println(arr[3][1]);
		System.out.println(arr[3][2]);
		
		
		System.out.println();
		
		System.out.println(arr[0][0] + "\t" + arr[0][1] + "\t" + arr[0][2] );
		System.out.println(arr[1][0] + "\t" + arr[1][1] + "\t" + arr[1][2] );
		System.out.println(arr[2][0] + "\t" + arr[2][1] + "\t" + arr[2][2] );
		System.out.println(arr[3][0] + "\t" + arr[3][1] + "\t" + arr[3][2] );
	}

}
