package chapter05;

public class ModifierDefaultMain {

	public static void main(String[] args) {
		
		ModifierDefault md = new ModifierDefault();
		
		md.name = "김민재"; // default 값이라 참조가능
		md.age = 20;
		
		md.tell();
		
		
	}

}
