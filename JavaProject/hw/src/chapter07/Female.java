package chapter07;

public class Female extends Person {
	
	String address;
	
	public Female(String name, String sNum , String address) {
		super(name, sNum);
		this.address =address;
	}

	@Override
	public void hello() {
		super.hello();
		System.out.println("제 주소는 " +address + "입니다.");
	}
	
	


	
	
}
