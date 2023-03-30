package inheritance;

public class Male extends Person{

	String address;

	public Male(String name, String ssn , String address) {
		super(name, ssn);
		this.address= address;
	}

	@Override
	public void hello() {
		super.hello();
		System.out.println(" 제가 사는곳은 " +address +"입니다." );
	}
	
	
	
}
