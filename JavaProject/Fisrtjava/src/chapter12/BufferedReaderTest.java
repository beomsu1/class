package chapter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
		BufferedReader in = null;
		
		String str = null;
		
		// Reader 객체 생성
		try {
			in = new BufferedReader(new FileReader("D:\\test\\test-text2.txt"));
			
			while(true) {
				// 읽기 시작
				str = in.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
			
			System.out.println("읽기 종료");
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
