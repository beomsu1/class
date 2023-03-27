package chapter4;

public class Q16 {

	public static void main(String[] args) {
		
		int i=1;
		int result=0;
		
		while(i<100) {
			result = result+i;
			i++;

		} System.out.println(result);
		
		result =0;
		for(i=1;i<100;i++) {
			result = result +i;
		} System.out.println(result);
		
		result =0;
		i=0;
		do {
			result = result + i;
			i++;
			
		}while(i<100);
		System.out.println(result);
		
		
	}

}
