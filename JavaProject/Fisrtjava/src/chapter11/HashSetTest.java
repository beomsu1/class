package chapter11;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		Object o;
		
		Integer i;
		
		set.add("손흥민");
		set.add("박지성");
		set.add("차범근");
		set.add("박지성");
		set.add("차범근");
		
		System.out.println("요소의 개수 : " + set.size());
		
		for(String name : set) {
			System.out.println(name);
		}
	
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(30);
		
		for(int num : numbers) {
			System.out.println(num);
		}
		
	
	}
}
