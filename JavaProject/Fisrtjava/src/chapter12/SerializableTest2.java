package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableTest2 {
	
	public static void main(String[] args) {

		ObjectInputStream inputStream = null;
		
		try {
			FileInputStream in = new FileInputStream("instanceData.ser");
			
			inputStream = new ObjectInputStream(in);
			
			// String newStr = (String) inputStream.readObject();
			// 첫번쨰로 person을 저장하고 두번쨰로 String을 저장했으니 순서대로 리드해야함.
			Person p = (Person) inputStream.readObject();
			String newStr = (String) inputStream.readObject();
			
			p.tell();
			System.out.println(newStr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
