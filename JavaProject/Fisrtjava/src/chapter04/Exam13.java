package chapter04;

public class Exam13 {

	public static void main(String[] args) {
		
		for(int i=2; i<9; i*=2) { //i*=2 == 2,4,8,16 , i+=2 == 2,4,6,8,10
			// System.out.println(i);
			
			for(int j=1 ; j<=i ; j++) {
				System.out.print(i +"X"+ j + "=" + i*j+" ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
