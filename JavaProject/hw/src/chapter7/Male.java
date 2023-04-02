package chapter7;

public class Male extends Person{
	
	String birthday;
	
	public Male(String name, String sNum , String birthday) {
		super(name, sNum);
		this.birthday = birthday;
	}

	@Override
	public void hello() {
		super.hello();
		System.out.println("제 생일은 " + birthday + "입니다.");
	}
	
	
	
	
}
