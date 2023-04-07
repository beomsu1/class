package chapter12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTest {
	
	public static void main(String[] args) {
		// 객체 저장
		Person person = new Person("KING", 20);
		String msg = "안녕하세요";
		
		ObjectOutputStream outputStream = null;
		
		try {
			FileOutputStream fos = new FileOutputStream("instanceData.ser");// 아무것도 기입안하면 프로젝트 폴더 경로로 들어감
			
			outputStream = new ObjectOutputStream(fos);
			
			outputStream.writeObject(person);
			outputStream.writeObject(msg);
			
			System.out.println("저장");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
		
	}
}
