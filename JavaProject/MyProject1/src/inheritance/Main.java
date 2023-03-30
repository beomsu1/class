package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Male("이범수", "981221-1234567", "광진구");
		Person person1 = new Female("이범순", "981221-2134567", "12월21일");
		
		person.hello();
		person1.hello();
		
		
	}

}
