package chapter10;

public class ExceptionTest {

	public static void main(String[] args){
		
		try {
			Class.forName("Example");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
