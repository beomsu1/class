package inheritance;

public class Female extends Person {

	String birthday;

	public Female(String name, String ssn, String birthday) {
		super(name, ssn);
		this.birthday = birthday;
	}

	@Override
	public void hello() {
		super.hello();
		System.out.println(" 제 생일은 " + birthday + "입니다.");
	}

}
