package chapter06;

public class ArrayTest08 {

	public static void main(String[] args) {

		int[][] arr = { { 100, 80, 40 }, { 60, 70, 80 }

		};

		// 2차원 배열은 1차원 배열을 가지는 배열
		// arr[0] => 1차원 배열을 가지는 배열 변수

		for (int[] temp : arr) {
			// int[] temp = int[1] , int[2]
			for (int i : temp) {
				System.out.print(i + "\t");
			}System.out.println();
		}

	}
}
