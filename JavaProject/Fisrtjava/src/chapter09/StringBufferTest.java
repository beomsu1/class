package chapter09;

public class StringBufferTest {
	
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();	// 문자열을 생성
		System.out.println(sb1.capacity());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity()); // Hello 에 + 기본값 16 = 21
		
		// append
//		sb.append('~'); // Hello~
//		sb.append(" JAVA"); // Hello~ JAVA
		sb.append('~').append(" JAVA"); // Hello~ JAVA
		System.out.println(sb);
		
		// delete
		sb.delete(5, 7); //5~(7-1)
		System.out.println(sb); // HelloJAVA
	
		// insert
		sb.insert(5,'~'); // 5번째 글자뒤로 삽입
		System.out.println(sb); //Hello~JAVA
		sb.insert(6, "~! ");	//6번쨰 뒤로 삽입
		System.out.println(sb); //Hello~~!JAVA
		
		sb.insert(sb.length(), false);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		String result = new String(sb); // 변경이 되면 안 되는 값들은 String으로 생성하고 변경해야 하는 값들은 빌드나 버퍼로 생성
		
		
		
	}

}
