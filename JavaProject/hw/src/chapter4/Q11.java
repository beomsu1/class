package chapter4;

public class Q11 {

	public static void main(String[] args) {
		
	// if(num%5!=0 || num%7!=0) 5의배수가 아니거나 7의배수가 아니다.
	//5의배수가 아니거나 7의배수가 아니다. 의 반대는=> 5의배수 이면서 7의배수인 값
		
		int num=1;
		int count =0;
		
		for(num=1;num<100;num++) {
			if(num%5==0 && num%7==0) {
				System.out.println(num);
				count++;
			}
		}
		System.out.println("count :" + count);
	}

}


