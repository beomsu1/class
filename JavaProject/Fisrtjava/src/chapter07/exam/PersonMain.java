package chapter07.exam;

public class PersonMain {

	public static void main(String[] args) {
		
		Male m1 = new Male("김민재", "961106-1234567" , "나폴리에서 뛰고있습니다.");
		
		m1.printGreeting();
		System.out.println();
		
		Person p1 = (Person)m1;
		
		Female f1 = new Female("이강인", "010517-3123456");
		
		f1.printGreeting();
		System.out.println();
		
		Person p2 = (Person)f1;
		
		p1.printGreeting();
		System.out.println();
		p2.printGreeting();
		
	}

}
