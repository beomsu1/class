package chapter11;

import java.util.HashMap;
import java.util.Set;

public class SmartPhoneHashMapTest {

	public static void main(String[] args) {
		
		HashMap<String ,SmartPhone> hashMap = new HashMap<>(); // hashmap 은 put으로 추가
		
		SmartPhone p = new SmartPhone("Spring", "010-1111-2222");
		hashMap.put("ver", p);
		
		p = new SmartPhone("Son", "010-1111-2221");
		hashMap.put("programName", p);
		
		System.out.println(hashMap.get("ver"));
		System.out.println(hashMap.get("programName"));
		
		System.out.println("===================");
		Set<String> keySet = hashMap.keySet();
		for(String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName));
		}
		
	}	
	
	
}
