package chapter11;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		
		for(int n : numbers) {
			System.out.println(n);
		}
		System.out.println();
		
		// collection<E> -> List<E> -> ArrayList<E>
		// String 타입의 객체를 저장 -> String 타입의 인스턴스를 참조하는 참조값을 저장
		ArrayList<String> list = new ArrayList<String>();

		// 인스턴스 저장 -> 요소를 저장 , add() 사용
		list.add("차범근"); // String 값이 들어가야함
		list.add(new String("박지성"));
		list.add("손흥민");

		// 데이터 참조 : get() 사용
		String name = list.get(2);
		System.out.println(name);
		System.out.println(list.get(0));
		System.out.println();

		// 특정위치의 요소 삽입
		list.add(1, "황인범");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		// 저장된 요소의 개수 : size()
		System.out.println("저장된 이름의 개수 : " + list.size());
		System.out.println("index : 0 ~ " + (list.size() - 1));

		// 반복문을 이용해서 일괄 처리

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " : " + list.get(i).charAt(0));
		}
		System.out.println("-----------------");
		for (String playerName : list) {
			// playerName 자리는 요소타입의 변수 : list 자리에 집합객체 , 배열 컬렉션
			System.out.println(playerName + " : " + playerName.charAt(2));
		}

		if (list.contains("손흥민")) {
			System.out.println("잘해라~ 화이팅");
		}

		if (list.contains("황인범")) {
			// 안정환 선수는 하차!
			list.remove("황인범");
		}

		System.out.println("-----------------");
		for (String playerName : list) {
			System.out.println(playerName + " : " + playerName.charAt(2));

		}

		// 전체 요소 삭제
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
	}
	
	

}