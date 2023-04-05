package chapter07;

public class PersonMain {
	
	public static void main(String[] args) {
			
		Male m = new Male("이범수", "981221-1111111", "12월21일");
		Female f = new Female("이정민", "000721-4110123", "성북구");	
		
		m.hello();
		f.hello();
	}
}
